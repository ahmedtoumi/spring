package com.atoumi.spring.jwt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Created by ahmed.ettoumi@gmail.com
 * @since 01/01/18.
 */
@Configuration
@EnableWebMvc
@ComponentScan({"com.atoumi"})
public class ResourceWebConfig extends WebMvcConfigurerAdapter {
}
