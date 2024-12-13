package com.bankingproject.microservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable() // CSRF korumasını devre dışı bırak
            .authorizeHttpRequests()
            .anyRequest()
            .permitAll(); // Tüm istekleri yetkilendirme olmadan kabul et
        return http.build();
    }
}
