package com.example.springfinal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
    @GetMapping("/")
    @ResponseBody
    public String main() {
        return "<a href=\"https://dhsimpson-ml-and-sw.tistory.com/\">https://dhsimpson-ml-and-sw.tistory.com/</a>";
    }
}
