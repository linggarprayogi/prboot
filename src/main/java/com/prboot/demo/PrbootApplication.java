package com.prboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableAutoConfiguration
@Controller
public class PrbootApplication {

//    @RequestMapping("/")
//    @ResponseBody
//    String home(){
//        return "Hallo World";
//    }
	public static void main(String[] args) {
		SpringApplication.run(PrbootApplication.class, args);
	}

}
