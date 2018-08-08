<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String cookieName="id";
	Cookie cookie = new Cookie(cookieName, "test01");
	cookie.setMaxAge(30);
	response.addCookie(cookie);

%>

<h2>쿠키를 생성하는 페이지</h2>
<%= cookieName %> 쿠키 생성..
<br>
<form class="" action="ex08_1.jsp" method="post">
  <input type="submit" name="" value="생성쿠키 확인">
</form>


</body>
</html>
