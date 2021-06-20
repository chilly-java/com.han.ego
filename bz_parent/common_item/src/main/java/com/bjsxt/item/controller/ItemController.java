package com.bjsxt.item.controller;

import com.bjsxt.item.service.ItemService;
import com.bjsxt.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    /**
     * 查询商品数据
     */
    @RequestMapping(value = "/selectTbItemAllByPage", method = RequestMethod.GET)
    public PageResult selectTbItemAllByPage(@RequestParam Integer page, @RequestParam Integer rows) {
        return this.itemService.selectTbItemAllByPage(page, rows);
    }
}