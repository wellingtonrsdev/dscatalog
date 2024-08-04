package com.devsuperior.dscatalog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.boot.autoconfigure.security.servlet.PathRequest.toH2Console;

@Configuration
public class SecurityConfig {

        @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
            http.csrf(csrf -> csrf.ignoringRequestMatchers(toH2Console()).disable());
            http.authorizeHttpRequests(auth -> auth.requestMatchers(toH2Console()).permitAll())
                    .headers(headers -> headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::disable));
            http.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
            return http.build();
        }
}
