package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import javax.sql.DataSource;


public class MyBeansConfig {
    @Bean
    StringBuilder getStringBuilder(){
        return new StringBuilder("bean from configuration");
    }
    @Bean
    @Primary
    Calc getCalc(){
        return new MyCalc();
    }
    @Bean(name = "calcNamedBean")
    Calc getCalc2(){
        return new MyCalc();
    }
    @Bean
    DataSource mysqlDataSource() {
        MysqlDataSource ds = new MysqlDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/mydb");
        ds.setUsername("root");
        ds.setPassword("password");
        return ds;
    }
}
