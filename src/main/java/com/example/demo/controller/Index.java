package com.example.demo.controller;

import com.example.demo.exception.MyException;
import net.sf.json.JSONObject;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/home")

    public String home(ModelMap modelMap) {
        System.out.println(modelMap.get("author"));
        return modelMap.get("author").toString();
    }


    @RequestMapping("/homes")
    public String home(@ModelAttribute("author") String author) {
        System.out.println(author);
        throw new MyException("101", "Sam 错误");
        //return author;
    }
}
