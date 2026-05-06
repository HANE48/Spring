package com.kh.param;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vo.Person;

@Controller
public class ParamController {
	//매핑을 여러개 하고 싶을때 사용하는 방법
	@RequestMapping(value={"/", "/insert_form.do"})
	public String insert_form(Model model) {
		return "person/insert_form";
	}
	
	//insert1.do?name=""&age=""&tel=""
	@RequestMapping("insert1.do")
	public String insert1(Model model, @RequestParam("name") String name, int age, String tel) {
		//웹에서 넘어오는 파라미터랑 동일한 이름으로 메서드에 파라미터에 주면 자동으로 넘어옴
		//annotation으로 RequestParam으로 어떤 파라미터를 받을지 설정할 수 있다.
		Person vo = new Person();
		vo.setName(name);
		vo.setAge(age);
		vo.setTel(tel);
		
		model.addAttribute("vo", vo);
		
		return "person/result";
	}
	
	@RequestMapping("insert2.do")
	public String insert2(Model model, Person vo) {
		//파라미터의 값을 vo에 알아서 넣어줌
		model.addAttribute("vo", vo);
		return "person/result";
	}
	
	
}
