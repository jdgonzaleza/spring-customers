package com.kelwin.security.springsecurityauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@ComponentScan(value = {"com.gorygon.cutomerservice.customerservice",
		"com.kelwin.security.springsecurityauthserver"})
@EntityScan(value = {"com.gorygon.rentcloud.commons",
		"com.kelwin.security.springsecurityauthserver.model"})
@CrossOrigin(value = "*")
public class SpringSecurityAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAuthServerApplication.class, args);
	}
}
