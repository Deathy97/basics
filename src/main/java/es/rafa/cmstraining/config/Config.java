package es.rafa.cmstraining.config;

import es.rafa.cmstraining.mapper.UserMapper;
import es.rafa.cmstraining.service.userService.UserService;
import es.rafa.cmstraining.service.userService.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public UserService getUserService() {
        return new UserServiceImpl();
    }

    @Bean
    public UserMapper getUserMapper() {
        return new UserMapper();
    }

}

