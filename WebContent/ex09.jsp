<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%!
	String id, pw;	
%>

<%
	id = request.getParameter("id");
	pw = request.getParameter("pw");
	
	//DB에 회원이 가입되었다고 가정 하고 쿠키를이용해서 회원인증하는 방법
	if(id.equals("test") && pw.equals("123")){
		Cookie cookie = new Cookie("id",id);
		cookie.setMaxAge(60*2);
		response.addCookie(cookie);
		response.sendRedirect("ex09_1.jsp");		
	}else{
		response.sendRedirect("login.html");
	}
	
	
	
	
	
	
	
%>


</body>
</html>