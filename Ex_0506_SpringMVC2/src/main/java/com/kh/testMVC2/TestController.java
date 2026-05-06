package com.kh.testMVC2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	public TestController() {
		System.out.println("TestController constructor");
	}
	
	@RequestMapping("/test.do")
	public String test(Model model, HttpServletRequest req) {
		String[] arr = {"hello world", "home", "chiken", "pitcher", "catcher"};
		
		//model에는 RequestScope에 저장됨
		model.addAttribute("arr", arr);
		model.addAttribute("ip", req.getRemoteAddr());
		
		//디렉토리 안에 넣어둔 jsp는 어느 디렉토리에 넣었는지 적어서 리턴하면 됨
		return "dept/test";
	}
}
