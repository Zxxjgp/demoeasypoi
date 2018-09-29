package com.example.demo.controller2;

import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.example.demo.utils.EasyPoiUtil;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: Test
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/9/28 20:40
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/28 20:40
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException {
        HttpServletResponse response = null;
        List<CourseEntity> listss = new ArrayList<>();
        List<StudentEntity> list = new ArrayList<>();

        StudentEntity s1 =  new StudentEntity("1","王江明",1,new Date());
        StudentEntity s2 =  new StudentEntity("2","王江明",1,new Date());
        list.add(s1);
        list.add(s2);
        CourseEntity l = new CourseEntity("1","翠花", "小强" , list);
        /*l.setCompanyLogo("D://timg.jpg");*/
        CourseEntity ll = new CourseEntity("2","翠花", "小强" , list);
       /* ll.setCompanyLogo("D://timg.jpg");*/
        ll.setTeacherEntity(new TeacherEntity("我是错管"));
        listss.add(l);
        listss.add(ll);
        ExportParams exportParams = new ExportParams("计算机一班学生", "学生");

        EasyPoiUtil.exportExcel( listss,"江苏华生基因", "2", CourseEntity.class, "11111", true,response);

/*        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("计算机一班学生", "学生"),
                CourseEntity.class, listss);
            File savefile = new File("D:/excel/");
            if (!savefile.exists()) {
                savefile.mkdirs();
            }
            FileOutputStream fos = new FileOutputStream("D:/excel/测试.xls");
            workbook.write(fos);
            fos.close();*/


    }


}
