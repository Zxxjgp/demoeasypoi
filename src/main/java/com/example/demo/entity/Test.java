package com.example.demo.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.entity
 * @ClassName: Test
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/10/12 11:27
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/10/12 11:27
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Comment a = new Comment("秦朗","123456");
        Comment b = new Comment("秦朗","123456");

        System.out.println(a.hash() == b.hash()  );


        String str = new String("abc");
        String s = "abc";
        System.out.println(s == str);

        String f = "ab"+null;
        System.out.println(f);

        Map<String,Integer> map = new HashMap<>();
        map.put(null,1);
        map.put(null,2);

        System.out.println(map.get(null));

    }
}
