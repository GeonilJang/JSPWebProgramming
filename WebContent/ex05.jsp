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
	response ��ü �޼ҵ�.
		   req
	client -> Server
		   <-
		   res

	response ��ü �޼ҵ�
	getCharacterEncoding() : ������ �� ���� ���ڵ��� ����
	addCookie(Cookie) : ��Ű�� ������ ��.
	sendRedirect(URL) : �̵��ϰ��� �ϴ� URL�� ������ ��.
		ex) ���ΰ� û�ҳ� �б� ó��.

 -->

<%!
  int age;
%>

<%
  String str = request.getParameter("age");
  age = Integer.parseInt(str);

  if(age >= 19){
    response.sendRedirect("a.jsp?age="+age);
  }else{
    response.sendRedirect("b.jsp?age="+age);
  }


%>





</body>
</html>
