package com.qiudaozhang.mybatisplustutorial.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;

/*
create table student(
    id int(10) primary key auto_increment,
    name varchar(50),
    age varchar(3)
);
 */
//@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @TableId(type = IdType.AUTO) // 指定表的主键 ， AUTO自增长，数据库必须有设置自增长才可以
    private Integer id;
    private String name;
    private Integer age;

}
