package com.hfj.cloud.resource.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
/**
 * @author HFJ
 *
 */
@EnableResourceServer
@SpringBootApplication
public class SpringCloudSecurityOAuth2ResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSecurityOAuth2ResourceServerApplication.class, args);
	}

}

