package com.qiudaozhang.mybatisplustutorial;

import com.qiudaozhang.mybatisplustutorial.domain.Student;
import com.qiudaozhang.mybatisplustutorial.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class StudentTest {
    @Resource
    private StudentMapper studentMapper;

    @Test
    void writeOne() {
        // 手动主键的方式

        Student student = Student.builder().name("刘德华").id(1)
                .age(22).build();
        studentMapper.insert(student);
    }
    @Test
    void writeOne2() {
        // 构造的实体没有指定主键，在实体上标记了
        Student student = Student.builder().name("郭富城")
                .age(22).build();
        studentMapper.insert(student);
    }

    @Test
    void  batchInsert() {


        Student s1 = Student.builder().name("迪丽热巴").age(23).build();
        Student s2 = Student.builder().name("马儿扎哈").age(23).build();
        List<Student> students = Arrays.asList(s1, s2);
        // ? 没有提供，这种我们需要自己去实现 mp没有限制我们继续使用XML，

        studentMapper.batchInsert(students);
    }
}
