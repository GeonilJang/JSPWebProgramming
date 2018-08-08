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
  	[JSP 태그 종류]
  	
  	지시자 (directive) :  <%@ %> 페이지 속성
  	
  	 - 지시자 3가지 종류 -
  	 page 지시자
  	 	(속성)
  	 		info : 페이지를 설명해주는 문자열 예> <%@ page info = "건일 작성"%>
  	 		language : jsp페이지에서 사용할 언어  <%@ page lnaguage="java"%>
  	 		contentType : jsp 페이지의 내용을 어떠한 형태로 출력할 지를 브라우저에게 알려주는 역할 (charset=euc-kr)
  	 		extends : jsp가 서블릿으로 변환될 때 상속받을 클래스를 지정하는 속성( 사용할 일이 거의 없다.)
  	 		import : 다른 패키지에 있는 클래스를 가져다 사용할 때. <%@ page import="java.util.*, java.sql.*"%>
  	 		session : HttpSessoin 속성의 사용 여부를 지정 <%@ page session = "false"%>
  	 		buffer : JSP페이지의 축력 크기를 KB단위로 지정하는 속성 기본값은 8KB
  	 		autoFlush : 기본값 true이고, 버퍼가 다 찼을 경우 자동적으로 버퍼를 비우는 속성
  	 		isThreadSage : 여러개의 요청을 처리할 지 여부를 결정 ( 잘 사용하지 않는 다 
  	 		errorPage : 예외 처리를 위한 페이지를 지정 -> jsp 저리중 문제가 발생하면 해당 파일 실행.
  	 		isErrorPage : 에러 페이지를 담당하는 페이지인지 여부를 지정하는 속성 
  	 		pageEncoding : 거의 사용하지 않는다.
  	 		
     ** JSP 페이지가 자동으로 임포트 하는 패키지 	 		 
       - javax.servlet
       - javax.servlet.jsp
       - javax.servlet.http
  	 		
 
  	 include 지시자 : 현재의 jsp 페이지에 다른 jsp 페이지나 html 문서를 불러와서 현재 페이지의 일부로 사용할 때 이요하는 속성. 불러올 대상은 파일입니다.
  	 	<%@ include file="a/aa.jsp%>
  	 
  	 taglib 지시자 : 액션을 사용할 때 필요한 지시자,
  	 			- 액션은
  	 				ㄱ. 액션을 사용할 때 기본적으로 사용할 수 있는 액션이있고, 
  	 				ㄴ. 액션이 속한 라이브러리를 설치해야만 사용할 수 있는 것도 있다.
  	 				
  	 			taglib 지시자는 ㄴ의 경우에 팔요하다.
  	 			
  	 			<%@ taglib prefix="c" uri="http://oracle.com/jsp/jstl/core" %> 
  	 
  	
  	
  	
  	스크립팅 요소  ( 스크립트릿 , 익스프레션 , 선언부 )
  	
  	스크립스릿 : <% %> 자바코드
  	익스프레션 : <%= %> 결과 출력 
  	선언 : <%! %> 변수, 메소드 선언
  	
  	주석 : <%-- --%>
  	액션태크 : <jsp:action></jsp:action> 자바빈 연결
  	
  
  
  
  [JSP의 내부 객체]
  내부객체 : 객체를 생성하지 않고 바로 사용할 수 있는 객체를 의미.
 JSP에서 제공되는 내부객체는 JSP 컨테이너에 의헤 Servlet으로 변환될 때 자동으로 객체가 생성된다.
  
  
  1> 입출력 객체  : request - doGet , doPost 메서드의 첫번째 파라미터와 동일 한 역할.
  			   response, - doGet, doPost 메서드의 두번째 파라미터와 동일한 역할.
               out - 브라우저로 HTML 코드를 출력하는 기능 (javax.servlet.jsp.jspWriter)
               
  2> 서블릿 객체 : page - JSP 페이지로 부터 생성된 서블릿.
  			  config - JSP 페이지의 구성정보를 가져오는 기능.
  
  3> 세션 객체 : session - 세션과 관련되 기능.
  4> 예외객체 : exception - 예외처리와 관련된 기능
  
  
  
   -->  
    
</body>
</html>