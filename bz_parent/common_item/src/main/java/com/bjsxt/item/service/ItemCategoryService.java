package com.bjsxt.item.service;

import com.bjsxt.pojo.TbItemCat;

import java.util.List;

public interface ItemCategoryService {

    List<TbItemCat> selectItemCategoryByParentId(Long id);

}
