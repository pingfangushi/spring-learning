package com.pingfangushi.learning.controller;

import com.pingfangushi.learning.configuration.UserProperties;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

/**
 * UserController
 * @author SanLi
 * Created by qinggang.zuo@gmail.com / 2689170096@qq.com on 2020/6/12 15:38
 */
@Getter
@Setter
@RequestMapping(value = "/user")
@RestController
public class UserController implements Serializable {
	/**
	 * logger
	 */
	private Logger logger = LoggerFactory.getLogger(UserController.class);

	/**
	 * fetch
	 * @return {@link Map}
	 */
	@GetMapping
	public Map<String, String> fetch() {
		logger.info("fetch user info");
		return Collections.singletonMap(properties.getUsername(), properties.getPassword());
	}

	/**
	 * UserProperties
	 */
	private final UserProperties properties;


	public UserController(UserProperties properties) {
		this.properties = properties;
	}
}
