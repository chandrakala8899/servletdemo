package com.neoteric;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if("admin".equals(username) && "password".equals(password)){
            HttpSession session = req.getSession();
            session.setAttribute("username",username);

            out.println("<h3>Welcome, " + username + "!</h3>");
            out.println("<a href='DashboardServlet'>Go to Dashboard</a>");
        } else {
            out.println("<h3>Invalid credentials. Try again!</h3>");
        }
    }

}
