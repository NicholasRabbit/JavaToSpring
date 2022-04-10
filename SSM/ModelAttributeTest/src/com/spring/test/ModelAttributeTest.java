package com.spring.test;

import com.spring.test.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelAttributeTest {

    //@ModelAttribute注解所在方法在所有请求方法之前执行
    @ModelAttribute
    public void test(){
        System.out.println("test execute！");

    }


    @RequestMapping(value="/mav/{id}/{username}")
    public String test02(@PathVariable("id") String userId){
        System.out.println("test02 execute==>"+userId);
        return "done";
    }
}
