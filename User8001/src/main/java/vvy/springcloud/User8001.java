package vvy.springcloud;

import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author ArKr
 * @date 2021/10/30 16:58
 * @apiNote
 **/
@EnableOpenApi
@SpringBootApplication
public class User8001 {
    public static void main(String[] args) {
        SpringApplication.run(User8001.class,args);
    }
}
