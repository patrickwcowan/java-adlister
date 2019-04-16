import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (name == null) {
            out.println("<h1>Hello, World!</h1>");
        } else {
            out.println("<h1>Hello, " + name + "!</h1>");
        }


    }
}

//@WebServlet(name = "HelloWorldServlet", urlPatterns = "/count")
//public class HelloWorldServlet extends HttpServlet {
//
//    int i = 0;
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//
//        response.setContentType("text/html");
//        PrintWriter output = response.getWriter();
//
//        i++;
//
//
//        output.println("<h1>Page viewed: "+ i +" times</h1>");
//
//
//        String reset = request.getParameter("reset");
//        if (reset.equalsIgnoreCase("reset")) {
//            i = 0;
//        }
//
//
//    }
//}


