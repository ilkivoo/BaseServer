package com.ooalyokhina.baseserver;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class PingService{

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
