package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UseBeanServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//インスタンス化
		EmpBean bean = new EmpBean();
		//EmpBeanクラスのsetNameメソッドに値をセットしている
		bean.setName("KnowledgeTaro");
		//EmpBeanクラスのsetAgeメソッドに値をセットしている
		bean.setAge(20);
		//リクエストオブジェクトにぶち込んでいる（keuがemp,beanがEmpbean)
		request.setAttribute("emp", bean);

		//RequestDispatcherを用いて、遷移先を指定している
		RequestDispatcher rd = request.getRequestDispatcher("/page/UseBean.jsp");
		//RequestDispatcherを用い値を飛ばしている
		rd.forward(request, response);
	}
}
