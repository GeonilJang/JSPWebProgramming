<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
out.println("====================== getAttribute =================<br/>");
	Object idObj = session.getAttribute("id");
	String id = (String) idObj;
	out.println(id+"<br/>");
	
	Object pwObj = session.getAttribute("password");
	String pw = (String)pwObj;
	out.println(pw+"<br/>");
out.println("====================== getAttribute =================<br/>");
	
	String sName, sValue;
	Enumeration enumeration = session.getAttributeNames();
	while(enumeration.hasMoreElements()){
		sName = enumeration.nextElement().toString();
		sValue = session.getAttribute(sName).toString();
		
		out.print(sName + " : "+sValue+"<br>");
		
	}
	
out.println("---------getId()-----------<br>");
String sID = session.getId();
int sInterval = session.getMaxInactiveInterval();

out.println("세션 ID "+sID+"<br>");
out.println("세션 유효 시간"+ sInterval+"<br>");


out.println("---------removeAttribute()-----------<br>");

session.removeAttribute("id");
Enumeration enu = session.getAttributeNames();
while(enu.hasMoreElements()){
	sName = enu.nextElement().toString();
	sValue = session.getAttribute(sName).toString();
	out.print(sName + " : "+sValue+ "<br>" );
}


out.println("---------invalid()-----------<br>");
session.invalidate();
if(request.isRequestedSessionIdValid()){
	out.println("유효");
}else{
	out.println("없음");
}




%>


</body>
</html>