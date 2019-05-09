package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	//
	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html; charset = UTF-8");
//servletでHTMLが書く準備
		PrintWriter out = resp.getWriter();
//変数名、の形式でHTMLがかけるよ
		out.println("<html>");
		out.println("<head><title>サンプルページ</title></head>");
		out.println("<body>");
		out.println("<h1>HelloWorld</h1>");
		out.println("</body>");
		out.println("</html>");
		//htmlに満足したらcloseしてね
		out.close();
	}

}
