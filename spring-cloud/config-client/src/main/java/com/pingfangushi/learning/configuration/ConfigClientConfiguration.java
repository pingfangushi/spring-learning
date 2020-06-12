package com.pingfangushi.learning.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * ConfigClientConfiguration
 *
 * @author SanLi
 * Created by qinggang.zuo@gmail.com / 2689170096@qq.com on 2020/6/12 16:02
 */
@Configuration
@EnableConfigurationProperties(value = {UserProperties.class})
public class ConfigClientConfiguration {
}
