package com.springcloud.teacher.dao;

import com.springcloud.teacher.pojo.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherDao extends JpaRepository<Teacher,Integer> {
}
