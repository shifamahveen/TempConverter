

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConvertServlet
 */
@WebServlet("/ConvertServlet")
public class ConvertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		int n = Integer.parseInt(request.getParameter("temp"));
		String unit = request.getParameter("unit");
		int result = 0;
		
		try {
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE html>");
			out.println("<html><head><title>Converted Temperature</title></head><body>");

			if(unit.equals("fahrenheit")) {
				result = (n*9/5)+32;
			}
			else {
				result = n+273;
			}
			
			System.out.println(result);
			out.println(result);
			out.println("<div style='color: blue; border: 1px solid red; padding: 5px;'>"+result+"</div>");
			out.println("</body>");
			out.println("</html>");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
