package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("===MEMBER 서블릿===");
		String dir = request.getParameter("dir");
		System.out.println("member dir(1)::" + dir );
		if(dir == null) {
			String dirPath = request.getServletPath();
			System.out.println("member dirPath ::"+dirPath);
			dirPath = dirPath.replace(".do","");
			System.out.println("member dirPath(2) ::"+dirPath);
			dir = dirPath.substring(1);
		}
		System.out.println("member dir(2)::" + dir );
		String cmd = request.getParameter("cmd");
		cmd = (cmd ==null) ? "move" : cmd;
		System.out.println("member cmd::" + cmd );
		String page = request.getParameter("page");
		if(page==null) {page="main";}
		System.out.println("member page::" + page );
		switch(cmd) {
		case"login":
			System.out.println("===LOGIN===");
			String id = request.getParameter("uid");
			String pass = request.getParameter("upass");
			System.out.println("id ::"+id);
			System.out.println("pw ::"+pass);
			if(!(id.equals("test")&&pass.equals("te"))) {
				System.out.println("member dir(3)::"+dir);
				System.out.println("member page(2)::"+page);
				dir = "";
				page = "index";
			}
			request.setAttribute("name", "test");
			request.setAttribute("compo", "login-success");
			Command.move(request, response, dir, page);
			break;
		case"move": 
			Command.move(request, response, dir, page);
			break;
		
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
