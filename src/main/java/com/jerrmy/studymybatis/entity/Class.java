package com.jerrmy.studymybatis.entity;

import java.util.List;

/**
 * DateTime : 2019/7/8  15:44
 * Author: Jermmy.
 */
public class Class {

    private int id;

    private String name;

    private Teacher teacher;

    private List<Student> students;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
