package com.sourcetree.life.service;

import com.sourcetree.life.request.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    public int add(Category category);

    //删
    public int delete(Integer id);

    //改
    public int edit(Category category);

    public Category get(Integer id);

    public List<Category> list();
}
