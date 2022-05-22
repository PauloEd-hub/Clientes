package com.program.fazoteuBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FazoteuBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FazoteuBackendApplication.class, args);
	}

}
