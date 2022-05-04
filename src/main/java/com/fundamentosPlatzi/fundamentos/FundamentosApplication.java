package com.fundamentosPlatzi.fundamentos;

import com.fundamentosPlatzi.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan(basePackages = {"com.fundamentosPlatzi.fundamentos.component.ComponentDependency"})
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	@Autowired
	public FundamentosApplication(ComponentDependency componentDependency){
		this.componentDependency = componentDependency;
	}
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args){
		componentDependency.saludar();
	}
}

