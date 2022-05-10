package com.fundamentosPlatzi.fundamentos;

import com.fundamentosPlatzi.fundamentos.bean.MyBean;
import com.fundamentosPlatzi.fundamentos.bean.MyBeanImplement;
import com.fundamentosPlatzi.fundamentos.bean.MyBeanWithDependency;
import com.fundamentosPlatzi.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
//@ComponentScan(basePackages = {"com.fundamentosPlatzi.fundamentos.component"})
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;
	//@Autowired
	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean,MyBeanWithDependency myBeanWithDependency){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
	}
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args){
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependency();
	}
}

