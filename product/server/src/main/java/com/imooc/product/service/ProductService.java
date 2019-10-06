package com.imooc.product.service;

import com.imooc.product.common.DecreaseStockInput;
import com.imooc.product.dataobject.ProductInfo;

import java.util.List;

/**
 * @Author: wenjun
 * @Date: 2019/9/18 21:44
 */
public interface ProductService {
    List<ProductInfo> findUpAll();//查询在架商品
    List<ProductInfo> findList(List<String> productIdList);//查询商品列表
    void decreaseStock(List<DecreaseStockInput> cartDTOList);//扣库存
}
