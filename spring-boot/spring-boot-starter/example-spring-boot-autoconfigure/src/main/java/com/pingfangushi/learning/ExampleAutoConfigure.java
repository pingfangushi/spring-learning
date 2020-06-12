package com.pingfangushi.learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 示例自动配置类
 *
 * @author SanLi
 * Created by qinggang.zuo@gmail.com / 2689170096@qq.com on 2020/1/29 17:55
 */
@Configuration
@EnableConfigurationProperties(value = ExampleProperties.class)
public class ExampleAutoConfigure {

    private Logger logger = LoggerFactory.getLogger(ExampleAutoConfigure.class);

    /**
     * 配置ExampleService
     *
     * @return {@link ExampleService}
     */
    @Bean
    @ConditionalOnMissingBean
    public ExampleService exampleService() {
        logger.info("Config ExampleService Start...");
        ExampleServiceImpl service = new ExampleServiceImpl(properties.getId(), properties.getIp());
        logger.info("Config ExampleService End.");
        return service;
    }

    /**
     * 注入ExampleProperties
     */
    private final ExampleProperties properties;

    public ExampleAutoConfigure(ExampleProperties properties) {
        this.properties = properties;
    }
}
