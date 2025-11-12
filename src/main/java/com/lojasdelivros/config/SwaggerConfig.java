package com.lojasdelivros.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
@Profile({"dev", "test"})
public class SwaggerConfig {
	
	private static final String TITLE = "API Loja de Livros";
    private static final String DESCRIPTION = "API conceitual de uma loja e gerenciamento de livros";
    private static final String VERSION = "1.0.0";
    private static final String NAME = "Getulio Azevedo";
    private static final String GITHUB = "git@github.com:getulio222/lojadelivrosapi.git";
    private static final String EMAIL = "getulio222@hotmail.com";
	
	@Bean
	public OpenAPI customOpenApi() {
		return new OpenAPI().info(new Info()
				.title(TITLE)
				.description(DESCRIPTION)
				.version(VERSION)
				.contact(new Contact()
						.name(NAME)
						.url(GITHUB)
						.email(EMAIL)));
	}

}
