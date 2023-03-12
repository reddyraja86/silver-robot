package com.demo.cache.SpringCustomCacheDemo.customCache;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CustomCacheManager implements CacheManager {

    Map<String, CacheManager> tenantsCacheMap = new HashMap<String, CacheManager>();

    @Override
    public Cache getCache(String name) {
        String tenantId = getTenantId("");
        CacheManager cacheManager = tenantsCacheMap.get(getTenantId(""));
        return cacheManager.getCache(name);
    }

    @Override
    public Collection<String> getCacheNames() {
        CacheManager cacheManager = tenantsCacheMap.get(getTenantId(""));
        return cacheManager.getCacheNames();
    }

    private String getTenantId(String tenantName) {
        return "";
    }
}
