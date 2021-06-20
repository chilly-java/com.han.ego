package com.bjsxt.backend.item.controller;

import com.bjsxt.backend.item.service.ItemService;
import com.bjsxt.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/backend/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    /*查询商品并分页处理*/
    @RequestMapping("/selectTbItemAllByPage")
    public Result selectTbItemAllByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "2") Integer rows){
        try{
            return this.itemService.selectTbItemAllByPage(page,rows);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Result.build(500,"error");
    }

}
