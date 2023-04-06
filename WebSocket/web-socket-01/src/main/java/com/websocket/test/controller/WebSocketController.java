package com.websocket.test.controller;


import com.websocket.test.server.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/websocket")
public class WebSocketController {

    //页面请求
    @GetMapping("/socket/{cid}")
    public ModelAndView socket(@PathVariable String cid) {
        ModelAndView mav=new ModelAndView("/socket");
        mav.addObject("cid", cid);
        return mav;
    }
    //推送数据接口，发送给指定cid的页面端
    //postman调用: http://localhost:9090/web-socket/websocket/socket/push/11/hello
    @ResponseBody
    @RequestMapping(value = "/socket/push/{cid}/{message}",method = {RequestMethod.GET})
    public Map<String,Object> pushToWeb(@PathVariable("cid") String cid, @PathVariable("message") String message) {
        Map<String,Object> result = new HashMap<>();
        try {
            WebSocketServer.sendInfo(message,cid);
            result.put("status","success");
        } catch (IOException e) {
            e.printStackTrace();
            result.put("status","fail");
            result.put("errMsg",e.getMessage());
        }
        return result;
    }
}
