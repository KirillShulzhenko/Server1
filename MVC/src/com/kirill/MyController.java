package com.kirill;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class MyController {
    @RequestMapping("/")
    String get()
    {
        return "index";
    }
}
