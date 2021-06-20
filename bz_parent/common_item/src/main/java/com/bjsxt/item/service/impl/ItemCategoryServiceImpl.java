package com.bjsxt.item.service.impl;

import com.bjsxt.item.service.ItemCategoryService;
import com.bjsxt.mapper.TbItemCatMapper;
import com.bjsxt.pojo.TbItemCat;
import com.bjsxt.pojo.TbItemCatExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*商品分类查询*/
@Service
public class ItemCategoryServiceImpl implements ItemCategoryService {

    @Autowired
    private TbItemCatMapper tbItemCatMapper;

    /*根据分类查询子节点*/
    @Override
    public List<TbItemCat> selectItemCategoryByParentId(Long id) {
        TbItemCatExample example = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(id);
        criteria.andStatusEqualTo(1);
        List<TbItemCat> list = this.tbItemCatMapper.selectByExample(example);
        return list;
    }

}
