package com.raishin.search.spring

import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.Configuration
import org.springframework.cache.concurrent.ConcurrentMapCacheManager
import org.springframework.cache.CacheManager
import org.springframework.context.annotation.Bean


@Configuration
@EnableCaching
class CacheConfig{

    @Bean
    fun cacheManager(): CacheManager {
        return ConcurrentMapCacheManager("SearchCache")
    }
}