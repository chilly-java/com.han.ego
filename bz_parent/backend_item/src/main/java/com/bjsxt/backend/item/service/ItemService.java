package com.bjsxt.backend.item.service;

import com.bjsxt.utils.Result;

public interface ItemService {

    Result selectTbItemAllByPage(Integer page, Integer rows);

}
