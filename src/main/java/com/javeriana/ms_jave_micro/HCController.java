package com.javeriana.ms_jave_micro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HCController {
    
    @GetMapping("/")
    public String getMicro() {
        return "ok";
    }
}
