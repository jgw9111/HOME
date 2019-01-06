package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import service.AccountService;
import service.AccountServiceImpl;

@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		System.out.println("===Account 서블릿===");
  		String dir = request.getParameter("dir");  	
  		System.out.println("account dir(1) ::" +dir);
  		if(dir==null) {
  			String dirPath = request.getServletPath();
  			dirPath = dirPath.replaceAll(".do","");
  			dir = dirPath.substring(1);
  		}
  		String page = request.getParameter("page");
  		if(page==null) {page="main";}
  		System.out.println("account page(1) ::" +page);
  		String cmd = request.getParameter("cmd");
  		cmd = (cmd==null)? "move" : cmd ;
  		System.out.println("account cmd(1) ::" +cmd);
  		AccountService accountService = new AccountServiceImpl();
  		switch(cmd) {
  		case"open-account":
  			String money = request.getParameter("money");
  			String today = accountService.maketoday();
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
