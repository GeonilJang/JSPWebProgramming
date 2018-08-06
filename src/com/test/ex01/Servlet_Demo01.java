package com.test.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * Servlet이란?
 * 
 * Servlet interface를 implement하여 생성한 자바 클래스
 * 서블릿은 서블릿 엔지에 의해 동작을하며, 여러 사용자에 의해 호출될 수 있따.
 * 
 * 자동으로 스레드 동작을 하기때문에 ! 멀티스레드 동작에 의해서 동작이 됩니다.
 * 
 * 
 * 서블릿 작성 규칙
 *  + 서블릿 javax.servlet.http.HttpServlet 클래스를 상속해야한다.
 *  + doGet 또는 doPost 메서드 안에 클라이언트의 요청이 왔을 때 처리야하 할 일들을 기술.
 *  + doGet 또틑 doPost의 두번째 자를 이용하여 html 문서를 출력하는데 이용한다. (HttpServleResponse) 
 *  
 *  + HttpServletRequest : 사용자의 정보를 서블릿 엔진에 전달하는 객체
 *   . 파라미터의 이름과 값
 *   . 사용자 컴퓨터 이름
 *   . 요청받는 서버의 이름
 *   . input type 의 데이터
 *   . 메소드 : getParameterValues(), getPrameter(), getRemoteHost(), getServerName()
 *   
 *   
 *  + HttpServletRespose : 서버에서 만든 응답을 "암호화" 해서 사용자에게 전달하는 객체
 *   . 응답으로 사용되는 content의 길이
 *   . 응답으로 사용되는 content의 타입, 화면에 출력해야 할 모든 값                                                         
 *   . 메소드 : setContentType(String type) , setContentLength(int length), getWriter()
 *   
 *   
 *  + doGet 메소드의 호출 : html form태그에서 method=get일 때 호출, 또는 url 창에다 직접 서블릿 맵핑한 servlet url을 입력했을 때도 호출
 *  + doPost 메소드의 호출 : html form태그에서 method=post일 때 호출
 *  
 *   
 *  + throws 절에 있는 ServletException 과 IOException은 생략이 가능, 다른 익셉션을 추가 할 수 없음.
 *  
 *   
 *  + 서블릭의 동작 순서
 *   웹 브라우저 -> 웹서버 -> 웹어플리케이션 서버 -> 서블릿 컨테이너(스레드 생성)
 *   
 *   
 * 
 * */

@WebServlet("/Sev01")
public class Servlet_Demo01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Servlet_Demo01() {
        super();
    }

	//request : 클라이언트의 요청 값 / response : 서버에서 사용자에게
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sum = 0 ; 
		for (int cnt = 0 ; cnt <= 100; cnt++) {
			sum += cnt;
		}
		
		response.setContentType("text/html; charset=euc-kr"); 
		PrintWriter out = response.getWriter();//웹 브라우저에 출력할 스트림을 얻어오는 과정
		out.println("<html>");
		out.println("<head>");
		out.println("<title>백까지의 합");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.printf("100까지의 합결과 : %d",sum);
		out.println("</body>");
		out.println("</html>");
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=euc-kr"); 
		PrintWriter out = response.getWriter();//웹 브라우저에 출력할 스트림을 얻어오는 과정
		out.println("<html>");
		out.println("<head>");
		out.println("<title>백까지의 합");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.printf("post");
		out.println("</body>");
		out.println("</html>");
	}

}
