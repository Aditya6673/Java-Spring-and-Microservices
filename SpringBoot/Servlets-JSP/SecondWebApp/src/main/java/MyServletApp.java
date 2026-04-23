import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/firstServlet")
public class MyServletApp extends HttpServlet {
    public MyServletApp(){
        System.out.println("Servlet is created");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        PrintWriter writer = response.getWriter();
        writer.println("<html><head><title>Second Web App</title>");
        writer.println("<body bgcolor='cyan'><h1><marquee>Welcome to Dynamic App</marquee></h1>");
        writer.println("</head><body><h1>Hello "+name+"! Your email is "+email+"</h1></body></html>");
        writer.close();
    }
}