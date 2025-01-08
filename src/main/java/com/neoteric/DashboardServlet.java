package com.neoteric;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class DashboardServlet extends HttpServlet {
    public  void doget(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out =  response.getWriter();

        HttpSession session = request.getSession(false);
        if(session!= null && session.getAttribute("username") !=null){
            String username =(String) session.getAttribute("username");
            out.println("<h3>Welcome back, " + username + "!</h3>");
            out.println("<a href='LogoutServlet'>Logout</a>");
        } else {
            out.println("<h3>You are not logged in. Please login first.</h3>");
        }
    }
}
