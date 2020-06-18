package com.com.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/sum")
    public String sum(@RequestParam("a") int a,@RequestParam("b") int b)
    {
        return ""+(a+b);
    }
}
