package com.test.ex01;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//���� ��ó��, ��ó�� 
//[��ó��] -> init() -> service() -> destroy() -> [��ó��]
/*
 * ��ó�� �ϴ� ���
 * @PostConstruct
 * -> �����ϴ� ��ü�� ������ ���Ŀ� �ʱ�ȭ �۾��� ���� �� �޼��忡 ����
 * 
 * ��ó�� �ϴ� ���
 * @PreDestroy : �� ������ ������! 
 * -> �����̳ʿ��� ��ü�� �����ϱ� ���� ȣ�� �� �޼��忡 ����
 * 
 * 
 * 
 * */


@WebServlet("/Cycle_Ex")
public class Cycle_Ex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Cycle_Ex() {
        super();
    }
    
    //@Override
    public void init() throws ServletException{
    	System.out.println("Call init");
    }
    

    
//    @Override
//    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
//    	System.out.println("Call Service......!!");
//    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
	}
	
	public void destroy() {
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
	}
	
	@PostConstruct
	private void initMethod() {
		System.out.println("PostConstruct");
	}
	
	@PreDestroy
	private void preDestory() {
		System.out.println("PreDestroy");
	}
	

}
