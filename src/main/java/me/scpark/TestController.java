package me.scpark;

import org.springframework.web.bind.annotation.*;

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

    @PostMapping ("/posttest")
    public String posttest(){
        return "안녕하세요? 'http://localhost:8081/posttest'에 대한 응답입니다.";
    }
    @PutMapping ("/puttest")
    public String puttest(){
        return "안녕하세요? 'http://localhost:8081/puttest'에 대한 응답입니다.";
    }
    @DeleteMapping ("/deletetest")
    public String deletetest(){
        return "안녕하세요? 'http://localhost:8081/deletetest'에 대한 응답입니다.";
    }
}
