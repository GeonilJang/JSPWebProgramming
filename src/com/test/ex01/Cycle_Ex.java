package com.test.ex01;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//서블릿 선처리, 후처리 
//[선처리] -> init() -> service() -> destroy() -> [후처리]
/*
 * 선처리 하는 방법
 * @PostConstruct
 * -> 의존하는 객체를 설정한 이후에 초기화 작업을 수행 할 메서드에 적용
 * 
 * 후처리 하는 방법
 * @PreDestroy : 헷 갈리지 마세요! 
 * -> 컨테이너에서 객체를 제거하기 전에 호출 된 메서드에 적용
 * 
 * 
 * 
 * */


@WebServlet("/Cycle_Ex")
public class Cycle_Ex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Cycle_Ex() {
        super();
    }
    
    //@Override
    public void init() throws ServletException{
    	System.out.println("Call init");
    }
    

    
//    @Override
//    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
//    	System.out.println("Call Service......!!");
//    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
	}
	
	public void destroy() {
		System.out.println("프로그램이 종료 되었습니다.");
	}
	
	@PostConstruct
	private void initMethod() {
		System.out.println("PostConstruct");
	}
	
	@PreDestroy
	private void preDestory() {
		System.out.println("PreDestroy");
	}
	

}
