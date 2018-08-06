package com.test.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/He")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Hello() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello Servlet...!!!!!"); // write at console!!
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	
	/*
	 * Servlet 특징
	 * 동적 웹어플리케이션 컴포넌트
	 * 확장자는 .java
	 * 클라이언트의 요청에 동적으로 작동한다.
	 * java thread를 이용해서 동작한다. -> 자바의 장접은 웹에 가는 부담을 줄여줄 수 있다. 
	 * MVC 패턴에서 controller로 이용된다.
	 * 
	 * */
	
	/*
	 *맵핑.
	 *
	 *기존의 경로 - http://localhost:8181/jsp2018Ex01/servlet/com.test.ex.hell 
	 *url 매핑경로 - http://localhost:8181/jsp2018Ex01/He -> 자세한 경로를 알수 없기 때문에 보안상 효과를 볼 수 있다.
	 *
	 *
	 *맵핑 방법 : web.xml을 이용하는 매핑 방법과 @어노테이션을 이용하는 방법이 있다.
	 *
	 *
	 * */
	


}
