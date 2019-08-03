package com.springcloud.student.service;

import com.springcloud.student.dao.StudentDao;
import com.springcloud.student.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public List<Student> findAll(){
        return studentDao.findAll();
    }
    public Student findById(int teacherid){
        return studentDao.findById(teacherid).get();
    }
}
