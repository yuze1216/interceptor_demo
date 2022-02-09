package com.yuze.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:yuze
 * @description:其他
 * @data:2021/9/2
 */

@RestController
@RequestMapping("demo")
public class DemoController {
    @RequestMapping
    public String demo(){

        return "hello";
    }
}
