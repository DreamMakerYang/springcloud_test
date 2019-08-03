package com.springcloud.teacher.client;

import com.springcloud.teacher.client.impl.StudentClientImpl;
import com.springcloud.teacher.pojo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(value = "student",fallback = StudentClientImpl.class) //value的值为需要调用的服务名称，application.yml中的spring.application.name
public interface StudentClient {
    @RequestMapping(value = "/student/{studentid}",method = RequestMethod.GET) //value中的uri需要补全，加上“/student”
    public Result findById(@PathVariable("studentid") int studentid); //PathVariable使用必须写value的值
}
