package com.tinghai.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tinghai.product.entity.Student;
import java.util.List;

/**
 * @author chendoudou
 * @description
 * @date 2023/6/2 11:58
 **/
public interface StudentService extends IService<Student> {
    List<Student> getStudentById(Integer id);
}
