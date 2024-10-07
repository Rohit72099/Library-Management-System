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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

@WebServlet("/RetrieveIssuedBooks")
public class RetrieveIssuedBooksServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String jdbcURL = "jdbc:mysql://localhost:3306/bookdata";
        String dbUser = "root";
        String dbPassword = "";

        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");

        if (username == null || username.isEmpty()) {
            // If username is not in session, try to get it from request parameter
            username = request.getParameter("username");
        }

        if (username == null || username.isEmpty()) {
            out.println("Error: Username parameter is missing.");
            return;
        }

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
            
            String sql = "SELECT id, title, author, issueDate " +
                    "FROM table1 " +
                    "WHERE username = ?";
            
            statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            
            result = statement.executeQuery();

            out.println("<html>");
            out.println("<head><title>Issued Books for " + username + "</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; }");
            out.println("table { width: 100%; border-collapse: collapse; }");
            out.println("table, th, td { border: 1px solid black; }");
            out.println("th, td { padding: 10px; text-align: left; }");
            out.println("th { background-color: #f2f2f2; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 style=\"font-family: 'Ubuntu', sans-serif;\">Issued Books for " + username + "</h1>");
            out.println("<table border='1' style='width: 95%; height: 400px;'>");
            out.println("<tr> <th>ID</th> <th>Title</th> <th>Author</th> <th>Issue Date</th> <th>RETURN_DATE</th> </tr>");

            boolean hasResults = false;
            while (result.next()) {
                hasResults = true;
                int id  = result.getInt("id");
                String title = result.getString("title");
                String author = result.getString("author");
                Date issueDate = result.getDate("issueDate");

                out.println("<tr>");
                out.println("<td> " + id + " </td>");
                out.println("<td>" + title + "</td>");
                out.println("<td>" + author + "</td>");
                out.println("<td>" + issueDate + "</td>");
                out.println("</tr>");
            }

            if (!hasResults) {
                out.println("<tr><td colspan='3'>No issued books found for user: " + username + "</td></tr>");
            }

            out.println("</table>");
            out.println("</body>");
            out.println("</html>");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            out.println("Error occurred: " + e.getMessage());
        } finally {
            try {
                if (result != null) result.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
