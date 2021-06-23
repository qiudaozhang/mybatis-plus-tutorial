package com.qiudaozhang.mybatisplustutorial.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qiudaozhang.mybatisplustutorial.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

// 继承基础的Mapper后可以复用其方法，省略基础的crud
public interface StudentMapper extends BaseMapper<Student> {

    int batchInsert(List<Student> students);
}
