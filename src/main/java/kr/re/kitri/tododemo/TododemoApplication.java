package kr.re.kitri.tododemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class TododemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TododemoApplication.class, args);
    }
}
