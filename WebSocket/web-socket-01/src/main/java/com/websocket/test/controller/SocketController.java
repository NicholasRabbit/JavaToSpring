package com.websocket.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SocketController {


    @RequestMapping(value = "/testSocket")
    public String testSocket(){
        return "list";
    }
}
