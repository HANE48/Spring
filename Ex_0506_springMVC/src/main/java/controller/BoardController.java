package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.BoardService;

/**
 * jsp에서 서블릿 역할을 controller가 대체함
 * annotation을 붙여서 controller라는 특수한 기능으로써 동작하게 하기 위한 수단
 * annotation; 프로그래밍 주석
 * controller는 servlet-context에서 만듬
 */
@Controller
public class BoardController {

	BoardService service = null;
	public void setService(BoardService service) {
		this.service = service;
	}
	
	public BoardController() {
		System.out.println("BoardController constructor");
	}
	
	//서블릿에서 주소 매핑하는것과 같이 매핑
	@RequestMapping("/board/list.do")
	public String list(Model model) {
		//@RequestMapping를 통해 호출된 url을 따라 실행되는 메서드 리턴타입은 대부분 String임 아니면 ModelandView를 사용함
		List<String> list = (List<String>) service.selectList();
		
		//model은 바인딩만을 위해 만들어진 객체임
		model.addAttribute("list", list);
		
		//포워딩 어느 jsp로 갈지 확장자 빼고 String형으로 적음
		return "board_list";
	}
	
	
}
