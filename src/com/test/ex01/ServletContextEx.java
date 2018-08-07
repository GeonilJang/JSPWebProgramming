package com.test.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//ServletContext를 이용한 데이터 공유
/*
 * 여러개의 Servlet에세 데이터를 공유해야 할 경우에 context parameter를 사용한다.
 * web.xml파일에 데ㅌ이터를 작성하며, Servlet에서 공유할 수 있다.
 * 
 * 1
 * Servlet 클래스 제작
 * web.xml파일에 context parameter 기술
 * ServletContext메소드를 이용해서 데이터를 사용한다.
 * getServletContext() : ServletContext를 얻어오는 메소드
 * 
 * */


@WebServlet("/SCEx")
public class ServletContextEx extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletContextEx() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = getServletContext().getInitParameter("id");
		String pw = getServletContext().getInitParameter("pw");
		String local = getServletContext().getInitParameter("local");
		
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();
		out.print(id);
		System.out.println(id + pw + local);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
