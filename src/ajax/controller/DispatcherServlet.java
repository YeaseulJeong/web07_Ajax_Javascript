package ajax.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("/DispatcherServlet")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private int count =0;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 모든 로직은 여기서 작성
		// count 증가하는 로직
		
		/*
		 * count ++;  // 1씩 증가
		
//		// 증가한 값을 다시
//		request.setAttribute("count", count);
//		request.getRequestDispatcher("count_result.jsp").forward(request, response);    // 이건 동기식 방식
		
		
		// ajax는 화면에 증가한 값을 바로 응답한다
		PrintWriter out = response.getWriter();
		out.print(count);   // out은 웹 브라우저로 날아가는 것 . 근데 그 브라우저 중 다시 요청한 곳으로 간다  html 파일의 callback() 함수 부분으로 날라간다 
		 */
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pass");
		
		PrintWriter out = response.getWriter();
		out.print("id "+ id + " pass "+ pw);    // html 파일의 callback() 함수 부분으로 날라간다 
		
		// 원래는 이 Servlet에 DAO로 연결되는 부분이 있어서 id, pw로 회원 찾아오는거겠지
		
		
	}
	
}
