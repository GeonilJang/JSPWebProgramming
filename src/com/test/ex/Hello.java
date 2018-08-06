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
	 * Servlet Ư¡
	 * ���� �����ø����̼� ������Ʈ
	 * Ȯ���ڴ� .java
	 * Ŭ���̾�Ʈ�� ��û�� �������� �۵��Ѵ�.
	 * java thread�� �̿��ؼ� �����Ѵ�. -> �ڹ��� ������ ���� ���� �δ��� �ٿ��� �� �ִ�. 
	 * MVC ���Ͽ��� controller�� �̿�ȴ�.
	 * 
	 * */
	
	/*
	 *����.
	 *
	 *������ ��� - http://localhost:8181/jsp2018Ex01/servlet/com.test.ex.hell 
	 *url ���ΰ�� - http://localhost:8181/jsp2018Ex01/He -> �ڼ��� ��θ� �˼� ���� ������ ���Ȼ� ȿ���� �� �� �ִ�.
	 *
	 *
	 *���� ��� : web.xml�� �̿��ϴ� ���� ����� @������̼��� �̿��ϴ� ����� �ִ�.
	 *
	 *
	 * */
	


}
