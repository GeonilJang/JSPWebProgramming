package com.test.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//���� ���ؽ�Ʈ�� �̿��� ������ ����
// �������� �������� �����͸� �����ؾ� �� ��쿡 context parameter�� ����Ѵ�.

/*
 * web.xml���Ͽ� �����͸� �ۼ��ϸ�, Servlet���� ������ �� �ִ�.
 * 
 * ����
 * ServletŬ���� ����
 * web.xml���Ͽ� context parameter ���
 * ServletContext�޼Ҹ��� �̿��ؼ� ���.
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
