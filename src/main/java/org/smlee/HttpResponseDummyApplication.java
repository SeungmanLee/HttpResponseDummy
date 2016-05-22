package org.smlee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class HttpResponseDummyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpResponseDummyApplication.class, args);
	}
}
