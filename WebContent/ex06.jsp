<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>



<p>지금 현재 페이지는ex06 페이지 입니다.</p>
<%-- <jsp:forward page="ex06_1.jsp"/> --%>

<jsp:include page="ex06_1.jsp"/>
<p>
  위 라인은 ex06_1 페이지 내용입니다.
  
</p>


</body>
</html>
