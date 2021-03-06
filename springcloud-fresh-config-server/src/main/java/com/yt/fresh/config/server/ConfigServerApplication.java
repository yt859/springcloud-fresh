package com.yt.fresh.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer  //配置文件服务器,从配置中心中读取配置文件
public class ConfigServerApplication {
public static void main(String[] args) {
	SpringApplication.run(ConfigServerApplication.class, args);
}
}
