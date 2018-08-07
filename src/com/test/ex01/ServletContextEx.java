package com.test.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//ServletContext�� �̿��� ������ ����
/*
 * �������� Servlet���� �����͸� �����ؾ� �� ��쿡 context parameter�� ����Ѵ�.
 * web.xml���Ͽ� �������͸� �ۼ��ϸ�, Servlet���� ������ �� �ִ�.
 * 
 * 1
 * Servlet Ŭ���� ����
 * web.xml���Ͽ� context parameter ���
 * ServletContext�޼ҵ带 �̿��ؼ� �����͸� ����Ѵ�.
 * getServletContext() : ServletContext�� ������ �޼ҵ�
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
