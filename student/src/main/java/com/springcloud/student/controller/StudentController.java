package com.springcloud.student.controller;

import com.springcloud.student.pojo.Result;
import com.springcloud.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;


@RestController
@RefreshScope
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Value("${message}")
    private String message;

    @RequestMapping(method = RequestMethod.GET)
    public Result findAll(){
        System.out.println(message);
        return new Result("查询成功",studentService.findAll());
    }

    @RequestMapping(value = "/{studentid}",method = RequestMethod.GET)
    public Result findById(@PathVariable int studentid){
        return new Result("查询成功",studentService.findById(studentid));
    }
}
