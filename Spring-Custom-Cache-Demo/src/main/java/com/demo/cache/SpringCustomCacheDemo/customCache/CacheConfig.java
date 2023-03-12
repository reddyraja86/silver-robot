package com.demo.cache.SpringCustomCacheDemo.customCache;

import org.springframework.boot.autoconfigure.cache.CacheManagerCustomizer;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfig {

    CacheManagerCustomizer<ConcurrentMapCacheManager> cacheManagerCustomizer() {
        return new ConcurrentCustomizer();
    }


    class ConcurrentCustomizer implements CacheManagerCustomizer<ConcurrentMapCacheManager> {

        @Override
        public void customize(ConcurrentMapCacheManager cacheManager) {
            cacheManager.setAllowNullValues(false);
            cacheManager.setStoreByValue(true);
            System.out.println(cacheManager);
        }
    }
}
