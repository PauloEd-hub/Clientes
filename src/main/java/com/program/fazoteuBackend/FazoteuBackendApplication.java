package com.program.fazoteuBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FazoteuBackendApplication {


	@RequestMapping("/teste")
	public String Teste(){
		return "olaaaa";
	}

	public static void main(String[] args) {
		SpringApplication.run(FazoteuBackendApplication.class, args);
	}

}
