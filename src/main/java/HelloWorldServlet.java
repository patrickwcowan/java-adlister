import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.getWriter().println("<h1>Hello, World!</h1>");

//<c:choose>
//    <c:when test="${param.username.equals('admin') && param.password.equals('password')}">
//        <% response.sendRedirect("http://localhost:8080/profile.jsp"); %>
//    </c:when>

//        if (param.user)
        String name = request.getParameter("name");
        if (name == null) {
            name = "you";
        } else if (name.equalsIgnoreCase("jbezos")) {
            response.sendRedirect("https://www.amazon.com/");
        }





        request.setAttribute("name", name);
        request.getRequestDispatcher("/login.jsp").forward(request,response);
    }
}
