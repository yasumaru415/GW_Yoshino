package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessonServlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
            //セッションの開始
			HttpSession session = request.getSession(true);
			//ログインユーザーという名前でナレッジ太郎が格納されている
			session.setAttribute("loginUser", "KnowledgeTaro");
			response.setContentType("text/html;charset=Windows-31J");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head><title>Session Servlet 1</title></head>");
			out.println("<body>");
			out.println("<h1>Session Servlet 1</h1>");
			out.println("<p>セッションを開始しました</p>");
			out.println("</body>");
			out.println("</html>");
			}
			}

