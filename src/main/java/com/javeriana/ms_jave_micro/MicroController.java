package com.javeriana.ms_jave_micro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroController {

    @Value("${app.message}")
    private String message;

    @Value("${app.urldb}")
    private String urlDB;

    @Value("${app.password}")
    private String pwd;
    
    @GetMapping("/get")
    public String getMicro() {
        return  message + " " + urlDB + " " + pwd;
    }
}
