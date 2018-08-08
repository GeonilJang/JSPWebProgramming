<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- 


<%
	int i = 0 ; 
	while(true){
		i++;
		out.print("5 * "+i+" = "+5*i +"<br/>");
%>
-------<br>
<%
	if(i >= 9)break;
}
%>


 --%>


<%! 
	int i = 100;
	String str = "TEST";
	public int mul(int a , int b){
		return a*b;	
	}
%> 


<%
	out.print("i = "+i+"<br/>");
	out.print("str = "+str+"<br/>");
	out.print("mul = "+mul(1,2));
%>

<!-- 
	표혁식 (expression) : 변수나 메소드의 결과 값을 출력 하는데 사용한다.
	표현시의 결과값은 String 타입.
	;은 사용할 수 없다.
 -->

<%= i %> <br/>
<%= str %><br/>
<%= mul(10,2) %><br/>


 
 
 
 </body>
</html>