package com.tinghai.product.controller;

import com.tinghai.product.entity.Student;
import com.tinghai.product.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @author chendoudou
 * @description
 * @date 2023/6/7 17:21
 **/
@RestController
@RefreshScope
@RequestMapping("/product")
public class TestController {

    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private String age;

    @Autowired
    private StudentService studentService;
    @RequestMapping("/hello")
    public String helloWorld() {
        return name + "，我的年龄" + age;
    }

    @GetMapping("/findAllStudent")
    public List<Student> findAllStudent(Integer id) {
        return studentService.getStudentById(id);
    }
}
