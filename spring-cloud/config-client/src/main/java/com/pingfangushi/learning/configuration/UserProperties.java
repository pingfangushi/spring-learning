package com.pingfangushi.learning.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 *  UserProperties
 *
 * @author SanLi
 * Created by qinggang.zuo@gmail.com / 2689170096@qq.com on 2020/6/12 15:29
 */
@Data
@ConfigurationProperties(prefix = "com.pingfangushi.learning.user")
public class UserProperties implements Serializable {
	/**
	 * username
	 */
	private String username;
	/**
	 * password
	 */
	private String password;
}
