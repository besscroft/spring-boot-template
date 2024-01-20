package dev.heming.template.main;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@SpringBootApplication(scanBasePackages = "dev.heming.template")
public class TemplateMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateMainApplication.class, args);
        log.info("(♥◠‿◠)ﾉﾞ  Spring Boot Template 系统启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }

    @GetMapping("/")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World!");
    }

}
