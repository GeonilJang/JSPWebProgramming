<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
		int sum = 0;
		for(int cnt = 1 ; cnt <= 100; cnt++)
			sum += cnt;
	%>
	1 부터 100까지의 합은 : <%= sum %>
	 --%>
	 
	 
	 <h3>오늘의 식닥</h3>
	  - 비빔밥 <br>
	  - 칼국수 <br>
	  - 김치밥 <br>
	  - 볶음밥 <br>
	 <%@ include file="test.jsp" %>
</body>
</html>