import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserRoleServlet")
public class UserRoleServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false); // Do not create a new session

        if (session == null || session.getAttribute("username") == null) {
            response.getWriter().write("SessionExpired");
            return;
        }

        String role = (String) session.getAttribute("role");

        if (role == null) {
            response.getWriter().write("Invalid");
        } else {
            response.getWriter().write(role);
        }
    }
}


