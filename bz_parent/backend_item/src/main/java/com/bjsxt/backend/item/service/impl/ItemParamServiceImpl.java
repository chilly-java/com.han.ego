package com.bjsxt.backend.item.service.impl;

import com.bjsxt.backend.item.feign.CommonItemFeignClient;
import com.bjsxt.backend.item.service.ItemParamService;
import com.bjsxt.pojo.TbItemParam;
import com.bjsxt.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * ItemParamService
 */
@Service
public class ItemParamServiceImpl implements ItemParamService {

    @Autowired
    private CommonItemFeignClient commonItemFeignClient;

    @Override
    public Result selectItemParamByItemCatId(Long itemCatId) {
        TbItemParam tbItemParam = this.commonItemFeignClient.selectItemParamByItemCatId(itemCatId);
        if(tbItemParam != null){
            return Result.ok(tbItemParam);
        }
        return Result.error("查无结果");
    }

}
