package com.fundamentosPlatzi.fundamentos.configuration;

import com.fundamentosPlatzi.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBeanTwoImplement();
    }

    @Bean
    public MyOperation beanOperationSum(){
        return new MyOperationImplement() {
        };
    }

    @Bean
    public MyBeanWithDependency beanOperationSumWithDepedency(MyOperation myOperation){
        return new MyBeanWithDependencyImplement(myOperation) {
        };
    }
}
