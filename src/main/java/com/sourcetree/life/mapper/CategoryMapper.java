package com.sourcetree.life.mapper;

import com.sourcetree.life.entity.po.CategoryPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CategoryMapper  {

    //参数
    Integer save(CategoryPo categoryPo);

    Integer update(@Param("aaa") CategoryPo categoryPo);

    void delete(CategoryPo categoryPo);

    CategoryPo findByid(@Param("zzzz") CategoryPo categoryPo);

    List<CategoryPo> list();

//    @Select("select * from l_category where id =#{id}")
//    CategoryPo findByid1(int id);
}
