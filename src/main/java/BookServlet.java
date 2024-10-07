
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String username = request.getParameter("username");
        Date issueDate = new Date(System.currentTimeMillis()); 

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdata", "root", "");

            String q = "INSERT INTO table1 (title, author, issueDate, username) VALUES (?, ?, ?, ?)";
            pstmt = con.prepareStatement(q);
            pstmt.setString(1, title);
            pstmt.setString(2, author);
            pstmt.setDate(3, issueDate);
            pstmt.setString(4,username);

            pstmt.executeUpdate();

            response.sendRedirect("confirmIssue.html");
            
            
            
           

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            out.println("Error occurred: " + e.getMessage());
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

