package br.com.ecommerce.fhvgts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FhvgtsApplication {
	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(FhvgtsApplication.class, args);

/*
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
		for(String beanName : allBeanNames) {
			System.out.println(beanName);
		}
*/
	}

}
