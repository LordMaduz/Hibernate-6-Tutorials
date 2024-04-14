package com.hibernate.naming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
public class HibernateNamingStrategyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateNamingStrategyApplication.class, args);
	}

}
