package com.test.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * Servlet�̶�?
 * 
 * Servlet interface�� implement�Ͽ� ������ �ڹ� Ŭ����
 * ������ ���� ������ ���� �������ϸ�, ���� ����ڿ� ���� ȣ��� �� �ֵ�.
 * 
 * �ڵ����� ������ ������ �ϱ⶧���� ! ��Ƽ������ ���ۿ� ���ؼ� ������ �˴ϴ�.
 * 
 * 
 * ���� �ۼ� ��Ģ
 *  + ���� javax.servlet.http.HttpServlet Ŭ������ ����ؾ��Ѵ�.
 *  + doGet �Ǵ� doPost �޼��� �ȿ� Ŭ���̾�Ʈ�� ��û�� ���� �� ó������ �� �ϵ��� ���.
 *  + doGet �Ǻz doPost�� �ι�° �ڸ� �̿��Ͽ� html ������ ����ϴµ� �̿��Ѵ�. (HttpServleResponse) 
 *  
 *  + HttpServletRequest : ������� ������ ���� ������ �����ϴ� ��ü
 *   . �Ķ������ �̸��� ��
 *   . ����� ��ǻ�� �̸�
 *   . ��û�޴� ������ �̸�
 *   . input type �� ������
 *   . �޼ҵ� : getParameterValues(), getPrameter(), getRemoteHost(), getServerName()
 *   
 *   
 *  + HttpServletRespose : �������� ���� ������ "��ȣȭ" �ؼ� ����ڿ��� �����ϴ� ��ü
 *   . �������� ���Ǵ� content�� ����
 *   . �������� ���Ǵ� content�� Ÿ��, ȭ�鿡 ����ؾ� �� ��� ��                                                         
 *   . �޼ҵ� : setContentType(String type) , setContentLength(int length), getWriter()
 *   
 *   
 *  + doGet �޼ҵ��� ȣ�� : html form�±׿��� method=get�� �� ȣ��, �Ǵ� url â���� ���� ���� ������ servlet url�� �Է����� ���� ȣ��
 *  + doPost �޼ҵ��� ȣ�� : html form�±׿��� method=post�� �� ȣ��
 *  
 *   
 *  + throws ���� �ִ� ServletException �� IOException�� ������ ����, �ٸ� �ͼ����� �߰� �� �� ����.
 *  
 *   
 *  + ������ ���� ����
 *   �� ������ -> ������ -> �����ø����̼� ���� -> ���� �����̳�(
 *   										1.������ ����
 *   										2.���� ��ü ����
 *   									)
 *   
 *  + ���� ��� : CGI�� ����� �� �ִ� Java ��� (������ CGI�� ������)
 *   1) ���� CGI�� �ε����� �ʱ�ȭ �۾��� �����ϱ� ������ ������ ���� ������尡 ũ��.
 *     �� ���� > �� �� �޸𸮿� �ε��Ǿ� ����Ǹ� �۾��� ��� �����Ǿ� �������� �޸𸮿��� ���� ���� �ʴ´� (��Ȱ��)
 *            ������� ���� ��û�� ���͵� �޸� �ε��̳� �ʱ�ȭ�� ó������ �ʴ´�.
 *            ��� ������ �� ���� �޸𸮿� �ε� �Ǿ�����.
 *    
 *   2) Ư�� �� ������ ���������̴�.
 *     ��  JAVA ���� �����Ǵ� ���α׷��̱� ������ �÷���(OS)���� ������ ���� ������ ���� �� �ִ�.
 *     �� �⺻�� CGI�� ��������� ���ϱ� ���ؼ� �߰����� API�� �ʿ��ߴ� �Ϳ� ���ؼ� ������ ���� API�� Ȱ���ؼ� �����ϸ� �ȴ�.
 *    
 *   3) ������ ��Ƽ ������� �����Ѵ�.  
 * 	         �� ������ CGIó�� ���������� ������ ��û�� ����  ������ ���μ����� �������� �ʴ´�.
 *      �� ��û�� ���ؼ� ������� ����.
 *      
 *   =====================================================================================================
 *   4) ������ �����ֱ� (life ����Ŭ)  - com.test.ex01.Cycle_Ex Ŭ������ ���ؼ� �����غ��ҽ��ϴ�.
 *    1. ���� ��ü ����  : ���� �� �� 
 *    2. init() ȣ�� : ���� �� ��  ( �������� ���� ó�� ���� �˴ϴ�. )
 *    3. service() > doGet(), doPost() ȣ�� : ��û �� �� �� (������� ����)
 *    4. destroy() ȣ��   : ������ �� ��
 *        
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

	//request : Ŭ���̾�Ʈ�� ��û �� / response : �������� ����ڿ���
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sum = 0 ; 
		for (int cnt = 0 ; cnt <= 100; cnt++) {
			sum += cnt;
		}
		
		response.setContentType("text/html; charset=euc-kr"); 
		PrintWriter out = response.getWriter();//�� �������� ����� ��Ʈ���� ������ ����
		out.println("<html>");
		out.println("<head>");
		out.println("<title>������� ��");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.printf("100������ �հ�� : %d",sum);
		out.println("</body>");
		out.println("</html>");
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=euc-kr"); 
		PrintWriter out = response.getWriter();//�� �������� ����� ��Ʈ���� ������ ����
		out.println("<html>");
		out.println("<head>");
		out.println("<title>������� ��");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.printf("post");
		out.println("</body>");
		out.println("</html>");
	}

}
