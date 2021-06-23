package com.qiudaozhang.mybatisplustutorial.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.util.Date;


/*
create table tb_coin(
    name varchar(50) primary key,
    icon varchar(500) ,
    created datetime
);
 */

// 数据库的设计为 tb_coin ，可以和数据库完成对应的映射关系
@TableName(value = "tb_coin")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Coin {

    @TableId
    private String name;

    private String icon; // 图标位置

    private Date created;
}
