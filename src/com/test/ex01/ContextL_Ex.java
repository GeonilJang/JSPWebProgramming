package com.test.ex01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * ServletContextListener
 * 
 * 
 * ServletContextListener(contextInitialized(), contextDestroy())
 * 웹어플리케이션을 감시하는 리스너이다.
 * 리스너의 해당
 * 리스너의 해당하는 어플리케이션이 시작, 종료시에 호출된다.
 * 
 * 리스너를 제작하고 web.xml 등록
 * 
 * 
 * */


@WebServlet(name = "CL_Ex", urlPatterns = { "/CL_Ex" })
public class ContextL_Ex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ContextL_Ex() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("컨텍스트 리스트 어플 시작");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
