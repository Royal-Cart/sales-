package com.example.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ProductServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.getWriter().println("<h1>Simple E-Commerce</h1>");
        response.getWriter().println("<ul>");
        response.getWriter().println("<li>Product 1 - $10</li>");
        response.getWriter().println("<li>Product 2 - $20</li>");
        response.getWriter().println("</ul>");
    }
}
