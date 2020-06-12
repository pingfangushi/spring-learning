package com.pingfangushi.learning;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * ServletInitializer
 * @author SanLi
 * Created by qinggang.zuo@gmail.com / 2689170096@qq.com on  2020/5/25
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ConfigServerApplication.class);
	}

}
