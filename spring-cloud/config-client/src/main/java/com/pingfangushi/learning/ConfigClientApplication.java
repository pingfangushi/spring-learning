package com.pingfangushi.learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ConfigClientApplication
 * @author SanLi
 * Created by qinggang.zuo@gmail.com / 2689170096@qq.com on  2020/6/12
 */
@SpringBootApplication
public class ConfigClientApplication implements Serializable {

	/**
	 * Logger
	 */
	private final static Logger logger = LoggerFactory.getLogger(ConfigClientApplication.class);
	/**
	 * HTTP
	 */
	public static final String HTTP = "http";
	/**
	 * HTTPS
	 */
	public static final String HTTPS = "https";
	/**
	 * SSL
	 */
	public static final String SERVER_SSL_KEY_STORE = "server.ssl.key-store";


	public static void main(String[] args) throws UnknownHostException {
		//获取开始时间
		long start = System.currentTimeMillis();
		SpringApplication app = new SpringApplication(ConfigClientApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		Environment env = app.run(args).getEnvironment();
		String protocol = HTTP;
		if (env.getProperty(SERVER_SSL_KEY_STORE) != null) {
			protocol = HTTPS;
		}
		//获取结束时间
		long end = System.currentTimeMillis();
		logger.info("\n----------------------------------------------------------\n\t"
						+ "名称:\t'{}' is running! Access URLs:\n\t" + "本地:\t {}://localhost:{}\n\t" + "外部:\t {}://{}:{}\n\t"
						+ "环境:\t {}\n\t" + "用时:\t {}\n----------------------------------------------------------",
				env.getProperty("spring.application.name"), protocol, env.getProperty("local.server.port"), protocol,
				InetAddress.getLocalHost().getHostAddress(), env.getProperty("local.server.port"),
				env.getActiveProfiles().length == 0 ? env.getDefaultProfiles() : env.getActiveProfiles(),
				(end - start) + "ms");
	}

}
