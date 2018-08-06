package com.test.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FormD_01")
public class FormDemo_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public FormDemo_01() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		
		
		//�ѱ�ó��
		//��Ĺ���� default ���� ó�� ����� ISO-8859-1 ����Դϴ�. �����ڵ� ����.
		// �����ڴ� ������ �ѱ� ���ڵ��� ���� ������ �ѱ��� ���� �� �ִ�.
		// get ��İ� post ����� �ѱ�ó���� �ٸ���.

		// get ����� �ѱ�ó���� ��Ĺ server.xml����  <connector>��
		// URIEncoding ="EUC-KR"�� ó���� �ؾ��Ѵ�.
		
		// post ����� �ѱ� ó���� doPost�޼ҵ� ������ �����Ѵ�.
		// request.setCharacterEncoding("EUC-KR");
		
		
		request.setCharacterEncoding("EUC-KR");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pass = request.getParameter("pw");
		
		String[] hobbys = request.getParameterValues("hobby");
		String sex = request.getParameter("gender");
		String local = request.getParameter("local");
		
		response.setContentType("text/html; charset=euc-kr"); 
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>welcome");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("�̸� : "+name +"<br/>");
		out.println("id : "+id+"<br/>");
		out.println("pw : "+pass+"<br/>");
		out.println("���: "+Arrays.toString(hobbys)+"<br/>");
		out.println("���� : "+sex+"<br/>");
		out.println("���� : "+local+"<br/>");
		
		out.println("</body>");
		out.println("</html>");
		
		out.close();
		
		
		
		
		
		 
		
		
		
		
	}

}
