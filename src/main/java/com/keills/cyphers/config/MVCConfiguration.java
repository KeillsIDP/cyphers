package com.keills.cyphers.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class MVCConfiguration {
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/resources/templates/"); // путь к папке с HTML-файлами
        resolver.setSuffix(".html"); // расширение HTML-файлов
        return resolver;
    }
}
