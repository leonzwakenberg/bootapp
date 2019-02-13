package com.capgemini.springboot.api;


import com.capgemini.springboot.controller.SchipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SchipEndPoint {

    @GetMapping("/schip")
    public String varen(){
        System.out.println("varen");
        return "Huren";
    }

}
