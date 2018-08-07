package com.test.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//서블릿 컷텍스트를 이용한 데이터 공유
// 여러개의 서블릿에서 데이터를 고융해야 할 경우에 context parameter를 사용한다.

/*
 * web.xml파일에 데이터를 작성하면, Servlet에서 공유할 수 있다.
 * 
 * 순서
 * Servlet클래스 시작
 * web.xml파일에 context parameter 기술
 * ServletContext메소르들 이용해서 기술.
 * 
 * 
 * */

@WebServlet("/ServletContext_Ex")
public class ServletContext_Ex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public ServletContext_Ex() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = getServletContext().getInitParameter("id");
		String password = getServletContext().getInitParameter("pw");
		String local = getServletContext().getInitParameter("local");
		
		PrintWriter out = response.getWriter();
		System.out.println(id+password+local);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
