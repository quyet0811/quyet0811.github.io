package com.createuser.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@ComponentScan(basePackages = "com.createuser")
public class ApplicationConfig {

    @Bean
    public ModelMapper modelMapper()
    {
        return new ModelMapper();
    }
}
