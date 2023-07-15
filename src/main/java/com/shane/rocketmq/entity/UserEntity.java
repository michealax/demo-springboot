package com.shane.rocketmq.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "user")
public class UserEntity {
    private Long id;

    private String name;

    private Integer age;

    private String email;
}
