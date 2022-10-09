package com.example;

import com.example.model.Role;
import com.example.model.User;
import com.example.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@EnableSwagger2
@SpringBootApplication
public class SpringBootUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUserServiceApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
/*

    @Bean
    CommandLineRunner run(UserService userService){
        return args -> {

            userService.saveUser(new User(null , "Leo Messi" , "leo123" ,"1234" , new ArrayList<>()));
            userService.saveUser(new User(null , "Cr Ronaldo" , "cr7" ,"1234" , new ArrayList<>()));
            userService.saveUser(new User(null , "Ibrahimovic Zlatan" , "ibra" ,"1234" , new ArrayList<>()));
            userService.saveUser(new User(null , "Robben Arren" , "robben" ,"1234" , new ArrayList<>()));


            userService.saveRole(new Role(null , "ROLE_USER" ));
            userService.saveRole(new Role(null , "ROLE_MANAGER" ));
            userService.saveRole(new Role(null , "ROLE_ADMIN" ));
            userService.saveRole(new Role(null , "ROLE_SUPER_ADMIN" ));


            userService.addRoleToUser("leo123" , "ROLE_USER");
            userService.addRoleToUser("leo123" , "ROLE_MANAGER");
            userService.addRoleToUser("cr7" , "ROLE_MANAGER");
            userService.addRoleToUser("ibra" , "ROLE_ADMIN");
            userService.addRoleToUser("robben" , "ROLE_SUPER_ADMIN");
            userService.addRoleToUser("robben" , "ROLE_ADMIN");
            userService.addRoleToUser("robben" , "ROLE_USER");


        };
    }
*/


    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.example")).build();
    }



}



//  https://www.marcobehler.com/guides/spring-security