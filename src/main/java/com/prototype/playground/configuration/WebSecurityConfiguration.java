package com.prototype.playground.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
                .antMatchers("/*").permitAll()
                .antMatchers("/employees/*").permitAll()
                .anyRequest().authenticated();
          //      .antMatchers(HttpMethod.GET,"/exploreCourse").permitAll()
    }
}
