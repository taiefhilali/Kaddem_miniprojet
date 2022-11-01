package tn.esprit.spring.tp1jpaentity3.configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;


// import org.tp1jpaentity3.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class OpenAPIConfig {
    @Configuration
    public class SpringDocConfig {
        @Bean
        public OpenAPI springShopOpenAPI() {
            return new OpenAPI().info(infoAPI());

        }
        public Info infoAPI() {
            return new Info().title("tp1jpantity3")
                    .description("TP étude de cas")
                    .contact(contactAPI());

        }
        public Contact contactAPI() {
            Contact contact = new Contact().name("")

                            .email("*************@esprit.tn")
                    .url("https://www.linkedin.com/in/**********/");
            return contact;
        }
}}
