package xin.stdpain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import xin.stdpain.domain.Person;
import xin.stdpain.service.PersonService;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by 维C果糖 on 2017/1/26.
 */

@Controller
public class TestController2 {

	@Resource
	PersonService ps;    // 注入 service 层
    
	@RequestMapping("/ceshi")        // 请求映射 http://localhost:8080/springmvc-annotation/ceshi.action
    public String goCeshi(HttpServletRequest request) {
        System.out.println(request.getRequestURL());  // 输出请求 URL 路径
        return "index";             // 返回逻辑名
    }
    @RequestMapping("/ans")
    public String goAns(Map<String,Object> model){
    	List<Person> personList = ps.findAll();
        model.put("personList",personList);           // 通过这一步，JSP 页面就可以访问 personList
    	model.put("ans","ANS");  
    	return "ans";
    }
}
