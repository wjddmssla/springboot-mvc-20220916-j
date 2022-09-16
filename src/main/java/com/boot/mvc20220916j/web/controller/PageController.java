package com.boot.mvc20220916j.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class PageController {

    @GetMapping({"/","/index"})
    public String loadIndex(Model model) {
        model.addAttribute("name", "김준일");
        return "index";
    }

    @GetMapping("/helloboot")
    public String loadHelloBoot(Model model) {
        model.addAttribute("nowDate", LocalDateTime.now());
        return "hello";
    }

    @GetMapping("/myinfo")
    public String loadMyInfo(Model model) {
        model.addAttribute("name", "박정은");
        model.addAttribute("age", "22");
        model.addAttribute("phone", "010-8886-4734");
        model.addAttribute("address", "부산시 사하구 서포로");
        return "myinfo";
    }
}
