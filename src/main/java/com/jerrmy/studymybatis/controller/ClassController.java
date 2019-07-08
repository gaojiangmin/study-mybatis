package com.jerrmy.studymybatis.controller;


import com.jerrmy.studymybatis.entity.Class;
import com.jerrmy.studymybatis.entity.User;
import com.jerrmy.studymybatis.service.ClassServiceImpl;
import com.jerrmy.studymybatis.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * DateTime : 2019/6/25  17:11
 * Author: Jermmy.
 */
@RestController
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private ClassServiceImpl classService;


    @GetMapping("/getClass")
    public List<Class> getUserById(@RequestParam(required = true) String classId) {
        List<Class> classes = new ArrayList<>();
        if (!StringUtils.isEmpty(classId)) {
            classes = classService.getClassById(classId);
            return classes;
        }
        return classes;
    }

}
