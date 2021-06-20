package com.bjsxt.backend.item.service.impl;

import com.bjsxt.backend.item.feign.CommonItemFeignClient;
import com.bjsxt.backend.item.service.ItemService;
import com.bjsxt.utils.PageResult;
import com.bjsxt.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*商品管理*/
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private CommonItemFeignClient commonItemFeignClient;

    @Override
    public Result selectTbItemAllByPage(Integer page, Integer rows) {
        PageResult pageResult = this.commonItemFeignClient.selectTbItemAllByPage(page, rows);
        if (pageResult != null && pageResult.getResult() != null && pageResult.getResult().size() > 0) {
            return Result.ok(pageResult);
        }
        return Result.error("查询无结果");
    }
}
