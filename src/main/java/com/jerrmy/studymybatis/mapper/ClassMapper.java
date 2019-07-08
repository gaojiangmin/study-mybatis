package com.jerrmy.studymybatis.mapper;


import com.jerrmy.studymybatis.entity.Class;
import com.jerrmy.studymybatis.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * DateTime : 2019/6/26  10:07
 * Author: Jermmy.
 */
@Component
@Mapper
public interface ClassMapper extends BaseMapper {


    List<Class> getClassById(String id);


}
