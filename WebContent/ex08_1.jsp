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
	Cookie [] cookies = request.getCookies();


	if(cookies != null){
		for(int i = 0 ; i < cookies.length; i++){
			String str = cookies[i].getName();
			if(str.equals("id")){
				out.println("cookies["+i+"] name : "+cookies[i].getName()+"<br/>");
				out.println("cookies["+i+"] value : "+cookies[i].getValue()+"<br/>");
			}
		}
	}
%>
<form class="" action="ex08_2.jsp" method="post">
  <input type="submit" name="" value="쿠키삭제">
</form>
</body>
</html>