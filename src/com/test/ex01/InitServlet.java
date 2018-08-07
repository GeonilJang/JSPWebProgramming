package com.test.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//컨텍스트 패스 (Context Path)
/*
 * WAS에서 웹 어플리케이션을 구분하기 위한 path를 말한다.
 * 이클립스에서 자동으로  server.xml에 만들어 준다. (톰캣)
 * 
 * 
 * + 서블릿 초기화 : ServletConfig 클래스
 * 
 * 특정 Servlet이 생설될때 초기에 필요한 데이터(아이디정보, 특정경로)를 초기화 하는 것으로 서블릿 초기화라고 한다.
 * 
 * (1) 초기화방법 1
 * - 초기화 파라미터 (서블릿이 샐성될 때 필요한 데이터 )는 web.xml에 기술한다.
 * - ServletConfig 클래스를 이용해서 초기화 파라미터 사용이 가능하다.
 * 
 * 
 * (2) 초기화방법 2
 * - Servlet 파일에 직접기술 하는 방법도 있다.
 * 
 * 
 * web.xml 초기화 파라미터 기술하기.
 * 1. Servlet 클래스 작성
 * 2. web.xml에 초기화 파라미터를 입력
 * 3. ServletConfig의 메소드를 이용해서 데이터를 사용(접근)한다.
 *                  - getInitParameter()메소드를 이용해서 접근할 수 있다.
 *        
 *                  
 *                  
 *                  
 * Servlet 파일에 초기화 파라미터를 직접 기술하는 방법
 * 1. Servlet 클래스 작성
 * 2. @WebInitParam에 초기화 파라미터를 작성
 * 3. ServletConfig 메소드를 이용한다.
 * 
 * */



@WebServlet(urlPatterns = {"/InitS"}, initParams = { @WebInitParam(name="id",value="test11"),@WebInitParam(name="pw",value="pw100"),@WebInitParam(name="local",value="홍대") })
public class InitServlet extends HttpServlet {
	
    public InitServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = getInitParameter("id");
		String pw = getInitParameter("password");
		String local = getInitParameter("local");
		 
		System.out.println(id+" "+pw+local);
		
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
