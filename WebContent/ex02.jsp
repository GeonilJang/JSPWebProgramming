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
	ǥ���� (expression) : ������ �޼ҵ��� ��� ���� ��� �ϴµ� ����Ѵ�.
	ǥ������ ������� String Ÿ��.
	;�� ����� �� ����.
 -->

<%= i %> <br/>
<%= str %><br/>
<%= mul(10,2) %><br/>


 
 
 
 </body>
</html>