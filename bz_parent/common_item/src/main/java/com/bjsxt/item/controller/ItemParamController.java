package com.bjsxt.item.controller;

import com.bjsxt.item.service.ItemParamService;
import com.bjsxt.pojo.TbItemParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*ItemParam*/
@RestController
@RequestMapping("/service/itemParam")
public class ItemParamController {

    @Autowired
    private ItemParamService itemParamService;

    /*根据商品分类ID查询规格参数模板*/
    @RequestMapping("/selectItemParamByItemCatId")
    public TbItemParam selectItemParamByItemCatId(@RequestParam Long itemCatId){
        return this.itemParamService.selectItemParamByItemCatId(itemCatId);
    }

}
