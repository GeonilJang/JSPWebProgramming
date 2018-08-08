<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ page import="java.util.Arrays" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<!-- 
	request객체 관련 메소드 (파라미터 메소드)
		
		getParameter(String name) : 해당 파라미터에 대한 값을 구해옵니다.
		getParameterNames() : 모든 파라미터의 이름을 얻어 올 때 사용한다.
		getParameterValues(String name) : name에 해당하는 파라미터의 값들을 얻어올 수 있따. (반환 타음은 배열)
			
 -->
 
 <%! String name, id, pw, gender, local;
 	 String hobbys[];
 %>
 
 <%
 	request.setCharacterEncoding("EUC-KR");
 	name = request.getParameter("name");
 	id = request.getParameter("id");
 	pw = request.getParameter("pw");
 	gender = request.getParameter("gender");
 	local = request.getParameter("local");
 	
 	hobbys = request.getParameterValues("hobby");
 
 %>
 
 이름 : <%= name %> <br/>
 아이디 : <%= id %><br/>
성별 : <%= gender %><br/>
취미 : <%= Arrays.toString(hobbys) %><br/>
지역 : <%= local %>

 
 
 
 
 
 
 

</body>
</html>