/*
package com.db.demo.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringSecurityConfig2 extends WebSecurityConfigurerAdapter {

    // Create 2 users for demo
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("user").password("{noop}password").roles("ADMIN")
                .and()
                .withUser("admin").password("{noop}password").roles("USER", "ADMIN");

    }
*/

    // Secure the endpoins with HTTP Basic authentication
 /*   @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                //HTTP Basic authentication
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/dbCtrl/**").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/dbCtrl").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/dbCtrl/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.PATCH, "/dbCtrl/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/dbCtrl/**").hasRole("ADMIN")
                .and()
                .csrf().disable()
                .formLogin().disable();
    }*/
/*

    @Bean
    public UserDetailsService userDetailsService() {
        //ok for demo
        User.UserBuilder users = User.withDefaultPasswordEncoder();

        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(users.username("user").password("password").roles("ADMIN").build());
        manager.createUser(users.username("admin").password("password").roles("USER", "ADMIN").build());
        return manager;
    }
*/

//}
