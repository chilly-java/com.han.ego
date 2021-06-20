package com.bjsxt.item.service;

import com.bjsxt.utils.PageResult;

public interface ItemService {

    PageResult selectTbItemAllByPage(Integer page, Integer rows);

}
