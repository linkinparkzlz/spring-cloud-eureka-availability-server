package com.example.springcloudeurekaavailabilityserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@EnableEurekaServer
public class SpringCloudEurekaAvailabilityServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaAvailabilityServerApplication.class, args);
	}
}
