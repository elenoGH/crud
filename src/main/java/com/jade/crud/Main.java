/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud;

import com.jade.crud.entity.Mail;
import com.jade.crud.service.MailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = {
    "com.jade.crud"
})
public class Main extends SpringBootServletInitializer {

	public static void main(String[] args) {
//            Mail mail = new Mail();
//            mail.setMailFrom("goeleno@gmail.com");
//            mail.setMailTo("goaguavida@gmail.com");
//            mail.setMailSubject("Spring Boot - Email Example");
//            mail.setMailContent("Learn How to send Email using Spring Boot!!!\n\nThanks\nwww.technicalkeeda.com");
//
//            ApplicationContext ctx = SpringApplication.run(Main.class, args);
//            MailService mailService = (MailService) ctx.getBean("mailService");
//            mailService.sendEmail(mail);
        
            SpringApplication.run(Main.class, args);
	}
	@Override

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

		return application.sources(Main.class);

	}
}