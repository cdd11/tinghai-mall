package com.tinghai.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tinghai.product.dao.StudentMapper;
import com.tinghai.product.entity.Student;
import com.tinghai.product.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chendoudou
 * @description
 * @date 2023/6/2 11:59
 **/
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Override
    public List<Student> getStudentById(Integer id) {
        List<Student> studentList = this.lambdaQuery().eq(id != null, Student::getId, id).list();
        return studentList;
    }
}
