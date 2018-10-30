package com.example.demo.test;

import com.example.demo.entity.NullTest;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.test
 * @ClassName: Test
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/10/16 15:38
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/10/16 15:38
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        String str = null;
        Integer h =null;
        NullTest comment = new NullTest();
    /*    comment.setName(str.toString());*/

        comment.setName(String.valueOf(h));
        System.out.println(comment.getName());
    }
}
