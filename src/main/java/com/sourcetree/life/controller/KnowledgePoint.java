package com.sourcetree.life.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/know")
public class KnowledgePoint {

    @RequestMapping(value = "test")
    public void test(){
        System.out.print(1111);
    }
}
