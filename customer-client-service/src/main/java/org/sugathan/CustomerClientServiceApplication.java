package org.sugathan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.sugathan.shared.CustomerServiceFeignClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableWebMvc
//@EnableFeignClients(basePackageClasses = CustomerServiceFeignClient.class)
//@ComponentScan(basePackageClasses = CustomerServiceFeignClient.class)
public class CustomerClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerClientServiceApplication.class, args);
	}
}
