package com.myspring.RedditCLone;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

import com.myspring.RedditCLone.config.SwaggerConfiguration;

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class RedditCLoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedditCLoneApplication.class, args);
	}

}
