package com.jerrmy.studymybatis.service;


import com.jerrmy.studymybatis.entity.Class;
import com.jerrmy.studymybatis.mapper.ClassMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DateTime : 2019/6/26  10:52
 * Author: Jermmy.
 */
@Service("classService")
public class ClassServiceImpl implements ClassService {


    @Autowired
    private ClassMapper classMapper;

    @Override
    public List<Class> getClassById(String id) {
        return classMapper.getClassById(id);
    }


}
