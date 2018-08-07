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
 * �����ø����̼��� �����ϴ� �������̴�.
 * �������� �ش�
 * �������� �ش��ϴ� ���ø����̼��� ����, ����ÿ� ȣ��ȴ�.
 * 
 * �����ʸ� �����ϰ� web.xml ���
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
		System.out.println("���ؽ�Ʈ ����Ʈ ���� ����");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
