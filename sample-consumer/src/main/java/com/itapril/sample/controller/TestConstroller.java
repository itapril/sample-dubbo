package com.itapril.sample.controller;

import com.itapril.sample.api.common.ResultResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author itapril.
 * @create 2018/8/9 09:03.
 */
@RestController
public class TestConstroller {

//	@Reference(version="1.0.0")
//	private StudentService studentService;

    @RequestMapping("/greeting")
    public ResultResponse greeting(@RequestParam(value="name",defaultValue="World") String name){
        System.out.println("begin...");

        ResultResponse result = new ResultResponse();
//		result = studentService.get(1L);
        System.out.println("OK!");
        return result;
    }
}
