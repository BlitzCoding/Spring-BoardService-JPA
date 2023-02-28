package com.mysite.sbb;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

    @GetMapping("/sbb")
    public void index()
    {
        System.out.println("index");
    }
}
