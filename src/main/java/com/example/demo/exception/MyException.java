package com.example.demo.exception;

import lombok.Data;

/**
 * @author sam
 * @since 2017/7/17
 */
@Data
public class MyException extends RuntimeException {

    public MyException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private String code;
    private String msg;

}