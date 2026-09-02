package me.scpark;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hi")
    public String hi(){
        return "안녕하세요? 'http://localhost:8081/h1'에 대한 응답입니다.";
    }
    @GetMapping("/test")
    public String test(){
        return "안녕하세요? 'http://localhost:8081/test'에 대한 응답입니다.";
    }
}
