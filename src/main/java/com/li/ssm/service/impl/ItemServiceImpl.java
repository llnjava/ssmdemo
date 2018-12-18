package com.li.ssm.service.impl;

import com.li.ssm.mapper.ItemMapper;
import com.li.ssm.pojo.Item;
import com.li.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lilaien on 2018/12/18.
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public Item queryItemById(Long id) {
        Item item = itemMapper.selectByPrimaryKey(id);
        return item;
    }
}
