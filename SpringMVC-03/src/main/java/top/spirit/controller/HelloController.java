package top.spirit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello1")
    public String hello1(Model model){
        model.addAttribute("msg1","HelloSpringAnnotaction1");
        return "hello1";
    }
    @RequestMapping("/hello2")
    public String hello2(Model model){
        model.addAttribute("msg2","HelloSpringAnnotaction2");
        return "hello2";
    }
}

