/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud;

import com.jade.crud.servces.StorageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import javax.annotation.Resource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = {
    "com.jade.crud"
})
public class Main extends SpringBootServletInitializer {

    @Resource
    StorageService storageService;
    
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

        return application.sources(Main.class);

    }

    public void run(String... arg) throws Exception {
        storageService.deleteAll();
        storageService.init();
    }
}
