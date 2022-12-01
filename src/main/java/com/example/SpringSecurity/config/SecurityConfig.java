package com.example.SpringSecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import com.example.SpringSecurity.security.*;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final AuthProviderImpl authProviderImpl;

    @Autowired
    public SecurityConfig(AuthProviderImpl authProviderImpl) {
        this.authProviderImpl = authProviderImpl;
    }

    //Configure authentication
    protected void configure(AuthenticationManagerBuilder auth){
        auth.authenticationProvider(authProviderImpl);
    }
}
