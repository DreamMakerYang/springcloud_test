package com.springcloud.teacher.client.impl;

import com.springcloud.teacher.client.StudentClient;
import com.springcloud.teacher.pojo.Result;
import org.springframework.stereotype.Component;

@Component
public class StudentClientImpl implements StudentClient {
    @Override
    public Result findById(int studentid) {
        return new Result("熔断器触发了");
    }
}
