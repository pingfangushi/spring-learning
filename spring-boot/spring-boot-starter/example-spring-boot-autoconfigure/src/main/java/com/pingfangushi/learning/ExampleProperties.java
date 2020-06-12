package com.pingfangushi.learning;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import static com.pingfangushi.learning.ExampleProperties.DEFAULT_PREFIX;

/**
 * 配置属性项
 *
 * @author SanLi
 * Created by qinggang.zuo@gmail.com / 2689170096@qq.com on 2020/1/29 17:47
 */
@Data
@ConfigurationProperties(value = DEFAULT_PREFIX)
public class ExampleProperties {
    /**
     * PREFIX
     */
    public static final String DEFAULT_PREFIX = "com.pingfangushi.example";
    /**
     * ID标识
     */
    private String id;

    /**
     * IP地址
     */
    private String ip;

}
