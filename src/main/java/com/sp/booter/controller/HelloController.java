package com.sp.booter.controller;

import com.sp.booter.mapper.FaqMapper;
import com.sp.booter.model.FaqRepository;
import com.sp.booter.model.Opac_faq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @Autowired
    public FaqMapper faqMapper;
    @RequestMapping("/hello")
    public Map<String,Object> sayHi(HttpServletRequest request, HttpSession session){
        Opac_faq faq = new Opac_faq();
        faq.setContent("<p>高级检索的使用</p>");
        faq.setTitle("高级检索");
        faq.setStatus(1);
        faq.setShow_order(0);
        faq.setCreate_time(new Timestamp(System.currentTimeMillis()));
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("a",session.getId());
        map.put("b",request.getRequestURI());
        //map.put("c",faqRepository.findById(1L));
        return map;
    }

    @RequestMapping("/faq")
    public Map<String,Object> faq(HttpServletRequest request, HttpSession session){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("a",session.getId());
        map.put("b",request.getRequestURI());
        map.put("c",faqMapper.getALl());
        return map;
    }
}
