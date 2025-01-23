package com.xuanhui.mall.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * redis util
 */
@Component
public class RedisUtil<K, V> {

    @Autowired
    private RedisTemplate redisTemplate;

    public void setObject(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public Object getObject(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 插入list 类型
     *
     * @param key
     * @param list
     */
    public <T> void setList(String key, List<T> list) {
        redisTemplate.opsForList().leftPushAll(key, list);
    }

    /**
     * 根据 key 获取value 为list 的所有值
     *
     * @param key
     * @return
     */
    public <T> List<T> getList(String key) {
        return redisTemplate.opsForList().range(key, 0, -1);
    }


    /**
     * 设置 value 为set的类型
     *
     * @param key
     * @param set
     */
    public <T> void setSet(String key, Set<T> set) {
        redisTemplate.opsForSet().add(key, set);
    }

    /**
     * value type is set, get  all values by key
     *
     * @param key
     * @return
     */
    public <T> Set<T> getSet(String key) {
        return redisTemplate.opsForSet().members(key);
    }

    /**
     * 设置key ，value
     * value type is hash
     *
     * @param key
     * @param map
     */
    public void setHash(String key, Map<K, V> map) {
        map.forEach((m, n) -> redisTemplate.opsForHash().put(key, m, n));
    }

    /**
     * 根据key 获取value
     *
     * @param key
     * @return
     */
    public Map<K, V> getHash(String key) {
        return redisTemplate.opsForHash().entries(key);
    }


    /**
     * 删除key
     *
     * @param key
     */
    public void del(String key) {
        redisTemplate.delete(key);
    }


    /**
     * 设置key的过期时间
     *
     * @param key
     * @param seconds
     */
    public void expire(String key, int seconds) {
        redisTemplate.expire(key, Duration.ofSeconds(seconds));
    }

    /**
     * 查看key的存活时间, 即ttl
     *
     * @param key
     * @return
     */
    public long ttl(String key) {
        return redisTemplate.getExpire(key);
    }


}
