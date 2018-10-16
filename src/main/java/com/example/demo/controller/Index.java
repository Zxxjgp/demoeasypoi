package com.example.demo.controller;

import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: Index
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/10/15 22:47
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/10/15 22:47
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RestController
public class Index {


    @RequestMapping("index")
    public String index(){
      return   "index";
    }
    @RequestMapping(value ="/hello", method = RequestMethod.GET)
    public String hello(HttpServletRequest request){
        Map<String, String> map = new HashMap<String, String>();
        map.put("result", "content");
        JSONObject resultJSON = JSONObject.fromObject(map); // 根据需要拼装json
        String jsonpCallback = request.getParameter("jsonpCallback");
        // 返回jsonp格式数据
        System.out.println(jsonpCallback + "(" + resultJSON.toString(1, 1) + ")");
        return jsonpCallback + "(" + resultJSON.toString(1, 1) + ")";
    }
}
