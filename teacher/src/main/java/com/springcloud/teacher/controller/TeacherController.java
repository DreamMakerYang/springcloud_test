package com.springcloud.teacher.controller;

import com.springcloud.teacher.client.StudentClient;
import com.springcloud.teacher.pojo.Result;
import com.springcloud.teacher.pojo.Teacher;
import com.springcloud.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @Autowired
    private StudentClient studentClient;

    @RequestMapping(value = "/student/{studentid}",method = RequestMethod.GET)
    public Result findStudentById(@PathVariable int studentid){
        return studentClient.findById(studentid);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Result findAll(){
        return new Result("查询成功",teacherService.findAll());
    }

    @RequestMapping(value = "/{teacherid}",method = RequestMethod.GET)
    public Result findById(@PathVariable int teacherid){
        return new Result("查询成功",teacherService.findById(teacherid));
    }
}
