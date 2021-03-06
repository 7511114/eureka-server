package com.bing.springcloud.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableEurekaServer
public class MyEurekaServerRunner {

	final static Logger logger = LoggerFactory.getLogger(MyEurekaServerRunner.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(MyEurekaServerRunner.class).web(true)
				.run(args);
		logger.debug("eureka已经启动,当前host：{}", applicationContext.getEnvironment().getProperty("HOSTNAME"));
	}
}
