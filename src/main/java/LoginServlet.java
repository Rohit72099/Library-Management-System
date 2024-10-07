
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/bookdata";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Validate user credentials
        if (isValidUser(username, password, response)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            // Optionally, set more attributes like user ID, roles, etc.
            response.sendRedirect("welcome.html"); // Redirect to dashboard or secured area
        } else {
            response.sendRedirect("login.html?error=1"); // Redirect back to login with error
        }
    }

    private boolean isValidUser(String username, String password, HttpServletResponse response) throws IOException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean isValid = false;

        try {
            // Connect to MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            // Create SQL SELECT statement
            String sql = "SELECT * FROM users WHERE username=? AND password=?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);

            // Execute the statement
            rs = stmt.executeQuery();

            if (rs.next()) {
                // Valid credentials
                isValid = true;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            // Handle errors
            response.sendRedirect("login.html?error=1"); // Redirect to login page on error
        } finally {
            // Close connections, result set, and statement
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
        return isValid;
    }
}

