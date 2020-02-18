package com.itheima.dao;

import com.itheima.pojo.Menu;

import java.util.List;
public interface MenuMapper {
    List<Menu> findAll();
    Menu findById(Integer id);
}
