package com.example.demofim;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String akce1() {
        return "Ahoj akce 456";
    }

    @RequestMapping("/cas")
    @ResponseBody
    public String akce2() {
        return new Date().toString();
    }

    @RequestMapping("/date")
    @ResponseBody
    public Date akce3() {
        return new Date();
    }

    @RequestMapping("/r")
    public String akce4() {
        return "redirect:/date";
    }
}
