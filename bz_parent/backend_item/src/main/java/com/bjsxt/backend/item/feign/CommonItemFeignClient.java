package com.bjsxt.backend.item.feign;

import com.bjsxt.pojo.TbItemCat;
import com.bjsxt.pojo.TbItemParam;
import com.bjsxt.utils.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "common-item")
public interface CommonItemFeignClient {

    /**
     * /service/item
     * */
    @GetMapping("/service/item/selectTbItemAllByPage")
    PageResult selectTbItemAllByPage(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows);

    /**
     * /service/itemCategory
     * */
    @PostMapping("/service/itemCategory/selectItemCategoryByParentId")
    List<TbItemCat> selectItemCategoryByParentId(@RequestParam("id") Long id);

    /**
     * /Service/itemParam
     * */
    @PostMapping("/service/itemParam/selectItemParamByItemCatId")
    TbItemParam selectItemParamByItemCatId(@RequestParam("itemCatId") Long itemCatId);

}
