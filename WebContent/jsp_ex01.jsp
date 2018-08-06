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
	jsp특징
		- 동적 웹어플리케이션 컴포넌트
		- 확장자는 jsp
		- 클라이언트의 요청에 동적으로 동작을 하며, 응답은 html로 응답을 한다.
		- jsp 파일은 서블릿으로 변환되어 실행되어진다.
		- mvc 패터에서 view로 이용됨.
		
		jsp -> 파일명_jsp.java(알아서 _jsp.java 가 붙습니다.)    javafile .java -> .class 로 변환
			<서블릿> java 파일. 
		
		jsp동작과정
		1. jsp 파일요청
		2. jsp 컨테이너로 전송 : 웹컨테이너로 jsp 파일 넘긴다.
		3. jsp 파일 파싱 : jsp 파일이 처음 요청된것이라면 파일을 파싱한다. 이전에 요청 되었던 페이지일 경우에는 6.번 단계에 있는 메모리에 로딩이 된다.
		4. 서블릿으로 변환 : jsp 파일을 서블릿이라고 하는 java 파일로 만든다.
		5. 클래스 파일 생성 : 서블릿 파일(java)은 실행이 가능한 class 파일로 컴파일 한다.
		6. 메모리에 로딩됨. : 클래스 파일은 메모리에 로딩이 되어 실행이 된다.
		7. html 전송 : 클래스 파일에 대한 실행 결과는 다시 웹 서버로 넘겨진다. 그러면 웹 서버는 html 형태로 사용자에게 응답을 한다.
		8. 브라우저에 html실행 되어짐. 
 -->

<h1>Hello JSP!!!</h1>
</body>
</html>