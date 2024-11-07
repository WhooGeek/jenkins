package com.ohgiraffers.jenkins.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                /* NodePort 설정으로 처리할때는 origin이 달라서 cors 처리가 필요
                .allowedOrigins("http://localhost:30000")
                Ingress 설정 시 단일 진입점을 사용해서 CORS 처리 불필요
                다만 다른 CORS 처리가 필요할 가능성을 염주에 두고 코드만 남겨놓음
                 */
                .allowedOrigins() // CORS처리 없앤코드
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
    }
}
