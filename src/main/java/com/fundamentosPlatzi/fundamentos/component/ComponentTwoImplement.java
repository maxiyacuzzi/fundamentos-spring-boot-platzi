package com.fundamentosPlatzi.fundamentos.component;

import org.springframework.stereotype.Component;
@Component
public class ComponentTwoImplement implements ComponentDependency {
        @Override
        public void saludar() {
            System.out.println("hola mundo desde mi componente dos");
        }
    }


