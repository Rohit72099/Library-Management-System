

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;




public class IssuedBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		 PreparedStatement stmt = null;
	     ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdata","root","");
			
			String q= "select * from table1";
			
			stmt = con.prepareStatement(q);

			rs = stmt.executeQuery();
			
			out.println("<html>");
	        out.println("<head><title>Issued Books</title></head>");
	        out.println("<body >");
	        out.println("<h1>All Users' Issued Book </h1>");
	        out.println("<table border='1' style='width: 95%; height: 400px;'>");
	        out.println("<tr><th>ID</th><th>TTILE</th><th>AUTHOR</th><th>ISSUE_DATE</th><th>USERNAME</th> <th>RETURN_DATE</th></tr>");
			
			while(rs.next()) {
				int id  = rs.getInt(1);
				String title = rs.getString(2);
				String author = rs.getString(3);
				Date issueDate = rs.getDate(4);
				String username = rs.getString(6);
				
				 out.println("<tr>");
		            out.println("<td> " + id + " </td>");
		            out.println("<td> " + title + " </td>");
		            out.println("<td> " + author + " </td>");
		            out.println("<td> " + issueDate + " </td>");
		            out.println("<td> " + username + " </td>");
		            out.println("</tr>");
				
				
//				 out.println("<h3>"+id+" "+title+" "+author+"</h3>");
			}
			
			out.println("</table>");
	        out.println("</body>");
	        out.println("</html>");
			

			
			
			
		}
		catch(Exception e) {
		e.printStackTrace();
		
		out.println("Error occured........");
	}
	}

	

}
