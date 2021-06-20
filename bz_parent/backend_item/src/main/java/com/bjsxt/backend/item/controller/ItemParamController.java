package com.bjsxt.backend.item.controller;

import com.bjsxt.backend.item.service.ItemParamService;
import com.bjsxt.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ItemParam
 */
@RestController
@RequestMapping("/backend/itemParam")
public class ItemParamController {

    @Autowired
    private ItemParamService itemParamService;

    /*根据商品分类ID查询规格参数模板*/
    @RequestMapping("/selectItemParamByItemCatId/{itemCatId}")
    public Result selectItemParamByItemCatId(@PathVariable("itemCatId") Long itemCatId){
        try{
            return this.itemParamService.selectItemParamByItemCatId(itemCatId);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Result.build(500,"error");
    }

}
