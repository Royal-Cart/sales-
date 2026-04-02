package com.example.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("products", new String[]{
                "Laptop", "Mobile", "Headphones", "Smart Watch"
        });

        request.getRequestDispatcher("products.jsp").forward(request, response);
    }
}
