package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;

import java.util.List;
//写服务层的业务
public interface CategoryService {

    ProductCategory findone(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
