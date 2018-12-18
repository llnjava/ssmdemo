package com.li.ssm.mapper;

import com.li.ssm.pojo.Item;

/**
 * Created by lilaien on 2018/12/18.
 */
public interface ItemMapper {

    Item selectByPrimaryKey(Long id);
}
