package com.xuanhui.mall.service.impl;

import cn.hutool.core.util.RandomUtil;
import com.xuanhui.mall.entity.HotProduct;
import com.xuanhui.mall.mapper.HotProductMapper;
import com.xuanhui.mall.service.HotProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HotProductServiceImpl implements HotProductService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private HotProductMapper hotProductMapper;

    /**
     * 1.生成热门商品
     * 2.添加到redis
     * 3.添加到mysql
     */
    @Override
    public void addHotProduct(HotProduct hotProduct) {
        if (hotProduct == null) {
            hotProduct = createHotProduct();
        }

        hotProductMapper.insertSelective(hotProduct);
        // opsForValue 代表了String数据类型
        redisTemplate.opsForValue().set("hotProduct:" + hotProduct.getId(), hotProduct);
    }

    @Override
    public List<HotProduct> getHotProduct(HotProduct hotProduct) {
        return null;
    }

    @Override
    public void updateHotProduct(HotProduct hotProduct) {
        if (hotProduct == null) {
            hotProduct = createHotProduct();
        }
        Long id = System.currentTimeMillis() - 10 * 60 * 1000L;
        hotProduct.setId(id);
        redisTemplate.delete("hotProduct:" + id);

        int res = hotProductMapper.updateByPrimaryKeySelective(hotProduct);
        if (res == 1) {
            redisTemplate.opsForValue().set("hotProduct:" + id, hotProduct);

        }
    }

    @Override
    public void delHotProduct(HotProduct hotProduct) {

    }


    private HotProduct createHotProduct() {
        HotProduct hotProduct = new HotProduct();
        String title = RandomUtil.randomString(4);
        hotProduct = new HotProduct();

        hotProduct.setId(System.currentTimeMillis());
        hotProduct.setSaleable(true);
        hotProduct.setTitle(title);

        hotProduct.setSubTitle("sub-" + title);
        hotProduct.setBrandId(RandomUtil.randomLong(4));
        hotProduct.setCreateTime(new Date());
        return hotProduct;
    }
}
