package com.xuanhui.mall.service;

import com.xuanhui.mall.entity.HotProduct;

import java.util.List;

/**
 * 热门商品
 */
public interface HotProductService {

    /**
     * 添加热门商品
     */
    void addHotProduct(HotProduct hotProduct);


    /**
     * 查询热门商品
     */
    List<HotProduct> getHotProduct(HotProduct hotProduct);



    /**
     * 修改热门商品
     */
    void updateHotProduct(HotProduct hotProduct);


    /**
     * 删除热门商品
     */
    void delHotProduct(HotProduct hotProduct);
}
