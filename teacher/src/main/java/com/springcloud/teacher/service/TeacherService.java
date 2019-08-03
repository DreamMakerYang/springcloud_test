package com.springcloud.teacher.service;

import com.springcloud.teacher.dao.TeacherDao;
import com.springcloud.teacher.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherDao teacherDao;

    public List<Teacher> findAll(){
        return teacherDao.findAll();
    }
    public Teacher findById(int teacherid){
        return teacherDao.findById(teacherid).get();
    }
}
