package com.li.ssm.controller;

import com.li.ssm.pojo.Item;
import com.li.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lilaien on 2018/12/18.
 */
@RequestMapping("item")
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("{id}")
    @ResponseBody
    public Item queryItemById(@PathVariable Long id){
        Item item = itemService.queryItemById(id);
        return item;
    }

    @RequestMapping("detail")
    public String detail(@RequestParam Long id, Model model){
        Item item = itemService.queryItemById(id);
        model.addAttribute("item",item);
        return "item";
    }
}
