package com.uuu.demo.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {


    @RequestMapping("/greeting")
    public String greeting(){
        return "Greeting";
    }

//    @RequestMapping("/greeting02")
//    public String greeting(Model model){
//        model.addAttribute("name","David");
//        return "greeting2";
//    }

        @RequestMapping("/greeting02")
    public String greeting(@RequestParam(value = "name",required = false,
                defaultValue = "deafault") String name,Model model){
        model.addAttribute("name",name);
        return "greeting2";
    }

}
