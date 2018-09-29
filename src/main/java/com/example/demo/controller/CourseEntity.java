package com.example.demo.controller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.util.PoiPublicUtil;
import lombok.Data;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.File;
import java.util.Date;
import java.util.List;

@Data
@ExcelTarget("courseEntity")
 public class CourseEntity implements java.io.Serializable {
    /** 主键 */
    private String        id;
    /** 课程名称 */


    @Excel(name = "课程名称", orderNum = "1", width = 25 , needMerge = true  )
    private String        name;



    @Excel(name = "任课老师", orderNum = "1", width = 25, needMerge = true )
    private String mathTeacher;


   @Excel(name = "课程图片", type = 2 ,width = 25 ,imageType = 1 , needMerge = true)
   private String  companyLogo;

    @ExcelCollection(name = "学生", orderNum = "4")
    private List<StudentEntity> students;

   public CourseEntity(String id, String name, String mathTeacher, List<StudentEntity> students) {
      this.id = id;
      this.name = name;
      this.mathTeacher = mathTeacher;
      this.students = students;
   }


}