package com.atividades11nov.front_produtos; // AJUSTE O PACKAGE CONFORME SEU PROJETO
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins(
                        "https://produtos-frontend-o38v.onrender.com",
                        "http://localhost:8080",
                        "http://localhost:3000"
                )
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}

// Abre o método para registrar as permissões de acesso
// Aplica estas regras a todas as rotas que começam com /api/
// Libera o acesso para o front-end publicado no Render
// Libera o acesso para testes locais na porta 8080
// Libera o acesso para testes locais na porta 3000
// Define quais ações HTTP são aceitas
// Permite o envio de qualquer tipo de cabeçalho na requisição
// Autoriza o envio de cookies e dados de autenticação