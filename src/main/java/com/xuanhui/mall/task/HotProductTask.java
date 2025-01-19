package com.xuanhui.mall.task;

import com.xuanhui.mall.service.impl.HotProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling
@Component
public class HotProductTask {
    @Autowired
    private HotProductServiceImpl hotProductService;

    @Scheduled(cron = "0 */1 * * * *")
    public void addHotProduct() {
        hotProductService.addHotProduct(null);
    }

    @Scheduled(cron = "0 */15 * * * *")
    public void updateHotProduct() {
        hotProductService.updateHotProduct(null);
    }
}
