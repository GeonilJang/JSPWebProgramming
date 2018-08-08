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
	response 객체 메소드.
		   req
	client -> Server
		   <-
		   res

	response 객체 메소드
	getCharacterEncoding() : 응답할 때 문자 인코딩을 얻어올
	addCookie(Cookie) : 쿠키를 지정할 때.
	sendRedirect(URL) : 이동하고자 하는 URL을 지정할 때.
		ex) 성인과 청소년 분기 처리.

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
