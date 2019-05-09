package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Request extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(true);
			session.setAttribute("name", "高尾");
			request.setAttribute("age",new Integer(20));
			RequestDispatcher rd = request.getRequestDispatcher("/page/Samplejsp.jsp");

			rd.forward(request, response);


}
}
