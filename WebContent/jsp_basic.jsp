<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
 
    
  <!-- 
  	[JSP �±� ����]
  	
  	������ (directive) :  <%@ %> ������ �Ӽ�
  	
  	 - ������ 3���� ���� -
  	 page ������
  	 	(�Ӽ�)
  	 		info : �������� �������ִ� ���ڿ� ��> <%@ page info = "���� �ۼ�"%>
  	 		language : jsp���������� ����� ���  <%@ page lnaguage="java"%>
  	 		contentType : jsp �������� ������ ��� ���·� ����� ���� ���������� �˷��ִ� ���� (charset=euc-kr)
  	 		extends : jsp�� �������� ��ȯ�� �� ��ӹ��� Ŭ������ �����ϴ� �Ӽ�( ����� ���� ���� ����.)
  	 		import : �ٸ� ��Ű���� �ִ� Ŭ������ ������ ����� ��. <%@ page import="java.util.*, java.sql.*"%>
  	 		session : HttpSessoin �Ӽ��� ��� ���θ� ���� <%@ page session = "false"%>
  	 		buffer : JSP�������� ��� ũ�⸦ KB������ �����ϴ� �Ӽ� �⺻���� 8KB
  	 		autoFlush : �⺻�� true�̰�, ���۰� �� á�� ��� �ڵ������� ���۸� ���� �Ӽ�
  	 		isThreadSage : �������� ��û�� ó���� �� ���θ� ���� ( �� ������� �ʴ� �� 
  	 		errorPage : ���� ó���� ���� �������� ���� -> jsp ������ ������ �߻��ϸ� �ش� ���� ����.
  	 		isErrorPage : ���� �������� ����ϴ� ���������� ���θ� �����ϴ� �Ӽ� 
  	 		pageEncoding : ���� ������� �ʴ´�.
  	 		
     ** JSP �������� �ڵ����� ����Ʈ �ϴ� ��Ű�� 	 		 
       - javax.servlet
       - javax.servlet.jsp
       - javax.servlet.http
  	 		
 
  	 include ������ : ������ jsp �������� �ٸ� jsp �������� html ������ �ҷ��ͼ� ���� �������� �Ϻη� ����� �� �̿��ϴ� �Ӽ�. �ҷ��� ����� �����Դϴ�.
  	 	<%@ include file="a/aa.jsp%>
  	 
  	 taglib ������ : �׼��� ����� �� �ʿ��� ������,
  	 			- �׼���
  	 				��. �׼��� ����� �� �⺻������ ����� �� �ִ� �׼����ְ�, 
  	 				��. �׼��� ���� ���̺귯���� ��ġ�ؾ߸� ����� �� �ִ� �͵� �ִ�.
  	 				
  	 			taglib �����ڴ� ���� ��쿡 �ȿ��ϴ�.
  	 			
  	 			<%@ taglib prefix="c" uri="http://oracle.com/jsp/jstl/core" %> 
  	 
  	
  	
  	
  	��ũ���� ���  ( ��ũ��Ʈ�� , �ͽ������� , ����� )
  	
  	��ũ������ : <% %> �ڹ��ڵ�
  	�ͽ������� : <%= %> ��� ��� 
  	���� : <%! %> ����, �޼ҵ� ����
  	
  	�ּ� : <%-- --%>
  	�׼���ũ : <jsp:action></jsp:action> �ڹٺ� ����
  	
  
  
  
  [JSP�� ���� ��ü]
  ���ΰ�ü : ��ü�� �������� �ʰ� �ٷ� ����� �� �ִ� ��ü�� �ǹ�.
 JSP���� �����Ǵ� ���ΰ�ü�� JSP �����̳ʿ� ���� Servlet���� ��ȯ�� �� �ڵ����� ��ü�� �����ȴ�.
  
  
  1> ����� ��ü  : request - doGet , doPost �޼����� ù��° �Ķ���Ϳ� ���� �� ����.
  			   response, - doGet, doPost �޼����� �ι�° �Ķ���Ϳ� ������ ����.
               out - �������� HTML �ڵ带 ����ϴ� ��� (javax.servlet.jsp.jspWriter)
               
  2> ���� ��ü : page - JSP �������� ���� ������ ����.
  			  config - JSP �������� ���������� �������� ���.
  
  3> ���� ��ü : session - ���ǰ� ���õ� ���.
  4> ���ܰ�ü : exception - ����ó���� ���õ� ���
  
  
  
   -->  
    
</body>
</html>