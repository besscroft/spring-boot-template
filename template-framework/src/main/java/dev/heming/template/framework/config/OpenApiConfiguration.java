package dev.heming.template.framework.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 文档配置
 * @Author Bess Croft
 * @Date 2024/1/20 20:09
 */
@Configuration
public class OpenApiConfiguration {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Spring Boot Template")
                        .description("基于 springboot3 的模板")
                        .version("v0.0.1")
                );
    }

}
