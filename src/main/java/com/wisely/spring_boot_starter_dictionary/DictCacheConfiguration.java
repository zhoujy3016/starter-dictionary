package com.wisely.spring_boot_starter_dictionary;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(DictCacheService.class)
@EnableAutoConfiguration
public class DictCacheConfiguration {
	
	@Bean(initMethod="init", destroyMethod="destory")
	@ConditionalOnMissingBean(DictCacheService.class)
	DictCacheService dictCacheService() {
		return new DictCacheService();
	}
}
