package com.javainuse.swaggertest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//import static com.google.common.base.Predicates.or;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()) //
				.select() //
				.apis(RequestHandlerSelectors.any()) //
				.paths(PathSelectors.any()) //
				//.paths(PathSelectors.ant("/hello-api"))
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder() //
				.title("Hello API") //
				.description("Hello API reference for developers") //
				.termsOfServiceUrl("http://www.hello.com") //
				.contact(new Contact("Mokhtar MEHALI", "http://asp-public.fr", "mokhtar.mehali@asp-public.fr"))//
				.license("JavaInUse License") //
				.version("1.0")//
				.build();
	}
}