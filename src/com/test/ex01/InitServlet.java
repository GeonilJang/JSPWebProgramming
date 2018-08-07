package com.test.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//���ؽ�Ʈ �н� (Context Path)
/*
 * WAS���� �� ���ø����̼��� �����ϱ� ���� path�� ���Ѵ�.
 * ��Ŭ�������� �ڵ�����  server.xml�� ����� �ش�. (��Ĺ)
 * 
 * 
 * + ���� �ʱ�ȭ : ServletConfig Ŭ����
 * 
 * Ư�� Servlet�� �����ɶ� �ʱ⿡ �ʿ��� ������(���̵�����, Ư�����)�� �ʱ�ȭ �ϴ� ������ ���� �ʱ�ȭ��� �Ѵ�.
 * 
 * (1) �ʱ�ȭ��� 1
 * - �ʱ�ȭ �Ķ���� (������ ������ �� �ʿ��� ������ )�� web.xml�� ����Ѵ�.
 * - ServletConfig Ŭ������ �̿��ؼ� �ʱ�ȭ �Ķ���� ����� �����ϴ�.
 * 
 * 
 * (2) �ʱ�ȭ��� 2
 * - Servlet ���Ͽ� ������� �ϴ� ����� �ִ�.
 * 
 * 
 * web.xml �ʱ�ȭ �Ķ���� ����ϱ�.
 * 1. Servlet Ŭ���� �ۼ�
 * 2. web.xml�� �ʱ�ȭ �Ķ���͸� �Է�
 * 3. ServletConfig�� �޼ҵ带 �̿��ؼ� �����͸� ���(����)�Ѵ�.
 *                  - getInitParameter()�޼ҵ带 �̿��ؼ� ������ �� �ִ�.
 *        
 *                  
 *                  
 *                  
 * Servlet ���Ͽ� �ʱ�ȭ �Ķ���͸� ���� ����ϴ� ���
 * 1. Servlet Ŭ���� �ۼ�
 * 2. @WebInitParam�� �ʱ�ȭ �Ķ���͸� �ۼ�
 * 3. ServletConfig �޼ҵ带 �̿��Ѵ�.
 * 
 * */



@WebServlet(urlPatterns = {"/InitS"}, initParams = { @WebInitParam(name="id",value="test11"),@WebInitParam(name="pw",value="pw100"),@WebInitParam(name="local",value="ȫ��") })
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
