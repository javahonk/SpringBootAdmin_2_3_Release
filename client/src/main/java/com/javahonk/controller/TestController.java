package com.javahonk.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BSHAR3 2/20/2021 2:55 PM
 */
@RestController
public class TestController {


    @GetMapping("/test")
    public ResponseEntity<String> getTest(){
        return  new ResponseEntity("Status OK", HttpStatus.OK);
    }

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }


}
