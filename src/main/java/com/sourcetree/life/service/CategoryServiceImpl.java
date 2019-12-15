package com.sourcetree.life.service;

import com.sourcetree.life.entity.po.CategoryPo;
import com.sourcetree.life.mapper.CategoryMapper;
import com.sourcetree.life.request.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private Logger logger= LoggerFactory.getLogger(CategoryServiceImpl.class);
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

    @Autowired
    private CategoryMapper categoryMapper;
    public int add(Category category) {
        CategoryPo categoryPo =new CategoryPo();
        BeanUtils.copyProperties(category, categoryPo);
        categoryPo.setUpdate_time(simpleDateFormat.format(new Date()));
        categoryPo.setId(3);
//        categoryMapper.delete(categoryPo);
        CategoryPo categoryPo1 = categoryMapper.findByid( categoryPo);
        System.out.print(categoryPo1.getName());
        return  1;

    }

    //删
    public int delete(Integer id) {

        return 1;
    }

    //改
    public int edit(Category category) {
        return 1;
    }

    public Category get(Integer id) {
        System.out.print("detail");
        return new Category();
    }

    public List<Category> list() {
        List<Category> list = new ArrayList<>();
        list.add(new Category());
        return list;
    }
}
