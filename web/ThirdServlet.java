package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//エンコーディングの設定
		req.setCharacterEncoding("UTF-8");
		//送信されたパラメータの取得
		String name =req.getParameter("name");
		String select =req.getParameter("select");
		String a =req.getParameter("a");
		String i =req.getParameter("i");
		String j =req.getParameter("j");
		String h =req.getParameter("h");
		String kanso =req.getParameter("kanso");
		//以下、htmlで出力されるためのコード
		resp.setContentType("text/html; charset = UTF-8");

		PrintWriter out =resp.getWriter();
		//htmlのあたいの出力
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>お名前</h1>");
		out.println("<p>"+name+"</p>");
		out.println("<h1>年齢</h1>");
		out.println("<p>"+select+"</p>");

		out.println("<h1>性別</h1>");
		out.println("<p>"+a+"</p>");
		out.println("<h1>興味のある言語</h1>");
		out.println("<p>"+i+j+h+"</p>");

		out.println("<h1>感想</h1>");
		out.println("<p>"+kanso+"</p>");
		out.println("</body>");
		out.println("");
		out.println("</html>");
			out.close();

	}

}
