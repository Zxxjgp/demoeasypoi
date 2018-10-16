package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.entity
 * @ClassName: Comment
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/10/12 11:08
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/10/12 11:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Data
public class Comment implements Serializable {

    private static final long serialVersionUID = -2925478059774061533L;

    private String id;

    private  String name;

    private String password;

    private String age;


    public Comment(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public int hash() {

        return Objects.hash(name, password);
    }
}
