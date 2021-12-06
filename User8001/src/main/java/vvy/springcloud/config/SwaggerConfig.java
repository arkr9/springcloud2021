package vvy.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import vvy.springcloud.controller.UserController;

/**
 * @author ArKr
 * @date 2021/10/30 17:32
 * @apiNote
 **/
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30).apiInfo(apiInfo())
                // 是否开启
                .enable(true)
                .select()
                // 扫描的路径包
                .apis(RequestHandlerSelectors.basePackage("vvy.springcloud.controller"))
                // 指定路径处理PathSelectors.any()代表所有的路径
                .paths(PathSelectors.any()).build().pathMapping("/");
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SpringBoot-Swagger3集成和使用-demo示例")
                .description("springboot | swagger")
                // 作者信息
                .contact(new Contact("name", "个人主页url", "email"))
                .version("1.0.0")
                .build();
    }


}
