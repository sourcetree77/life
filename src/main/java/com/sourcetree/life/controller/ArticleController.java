package com.sourcetree.life.controller;

import com.sourcetree.life.request.Category;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "Article")
public class ArticleController {
    //增
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public int add(@Valid @RequestBody Category category) {
        System.out.print("add");
        return 1;
    }

    //删
    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public int delete(@PathVariable Integer id) {
        System.out.print("add");
        return 1;
    }

    //改
    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public int edit(@Valid @RequestBody Category category) {
        System.out.print("edit");
        return 1;
    }

    //查
    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    public Category get(@PathVariable Integer id) {
        System.out.print("detail");
        return new Category();
    }

    //列表
    @RequestMapping(value = "list", method = RequestMethod.POST)
    public List<Category> list() {
        System.out.print("list");

        List<Category> list = new ArrayList<>();
        list.add(new Category());
        return list;
    }
}
