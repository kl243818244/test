package com.demo.merchant.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
//@ComponentScan(basePackages = "com.demo")
public class MerchantSsoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MerchantSsoApplication.class, args);
    }
    
}
