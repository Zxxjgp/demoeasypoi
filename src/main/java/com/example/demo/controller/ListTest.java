package com.example.demo.controller;

import org.apache.catalina.core.ApplicationContext;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: ListTest
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/10/15 21:20
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/10/15 21:20
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ListTest {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(33, 24, 18, 6, 9, 99);
        Collections.sort(intList);
        Collections.reverse(intList);
        for (Integer j:
             intList) {
            System.out.println(j);
        }

        List<String> listOne = Arrays.asList("A", "B", "C", "D");
        List<String> listTwo = Arrays.asList("X", "Y", "Z");
        Collections.copy(listOne, listTwo);

        System.out.println(listOne);// [X, Y, Z, D]
        System.out.println(listTwo);//[X, Y, Z]

        List<String> list3 = Arrays.asList("A", "B", "C", "D");
        List<String> list4 = Arrays.asList("X", "Y", "Z", "C");
        boolean disJoint = Collections.disjoint(list3, list4);
        // true
        System.out.println(disJoint);
        List<String> replaceAllCandidate = Arrays.asList("A", "B", "C");
        // 将A用Z代替
        Collections.replaceAll(replaceAllCandidate, "A", "Z");
        // [Z, B, C]
        System.out.println(replaceAllCandidate);


        List<String> reverseOrderTest = Arrays.asList("A", "B", "C", "D", "E",
                "F");
        Comparator c = Collections.reverseOrder();
        Collections.sort(reverseOrderTest, c);
        // [F, E, D, C, B, A]
        System.out.println(reverseOrderTest);


    }
}
