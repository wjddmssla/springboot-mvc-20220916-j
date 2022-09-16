package com.boot.mvc20220916j.web.controller.api;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
public class ResponseBodyController {

//    Logger LOGGER = LoggerFactory.getLogger(getClass());

    @ResponseBody
    @GetMapping("/api/text")
    public String textGetReq(@RequestParam String value, int num) {
        return "파라미터 값: " + value + "," + num;
    }

    public String textPostReq(@RequestParam String name, int age) {
        log.error("name: {}, {}, {}, {}", name, name,  name, name);
        log.info("age: {}", age);
        return "name: " + name + ",age: " +age;
    }

    @ResponseBody
    @PutMapping("/api/text")
    public String textPutReq() {
        log.info("put Request!!");
        return "풋 요청에 대한 응답";
    }

    @ResponseBody
    @DeleteMapping("/api/text")
    public String textDeleteReq() {
        return "Delete요청에 대한 응답";

    }
}
