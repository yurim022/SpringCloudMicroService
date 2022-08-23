package com.example.firstservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/first-service")
@Slf4j
public class FirstServiceController {
    Environment environment;

    public FirstServiceController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Yurim's First service.";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("first-request") String header) {
        log.info(header);
        return "Hello World in First Service.";
    }

    @GetMapping("/check")
    public String check(HttpServletRequest request){
        log.info("Server port = {}", request.getServerPort());
        return String.format("This is a message from First Service on PORT %s"
        , environment.getProperty("local.server.port"));
    }

}
