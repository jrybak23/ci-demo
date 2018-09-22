package com.example.cidemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Igor Rybak
 * @since 22-Sep-2018
 */
@RestController
public class DemoController {

    @GetMapping("/")
    public String getHello() {
        return "Hello world!";
    }

    @GetMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
}
