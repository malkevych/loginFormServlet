package com.ws;

import com.data.UserData;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Bohdan on 20.01.16.
 */

public class LoginServlet extends HttpServlet {

    private static String FORMSTR = "<form method=\"post\" action=\"login\">Login:<br><input type=\"text\" name=\"username\">" +
            "                \"<br>Password:<br><input type=\"text\" name=\"password\"><input type=\"submit\" value=\"Submit\"></form>";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usernameParameter = "username";
        String passwordParameter = "password";

        String username = request.getParameter(usernameParameter).toLowerCase();
        String password = request.getParameter(passwordParameter);

        UserData data = new UserData();
        boolean isPresent = data.isUserPresent(username, password);
        if (isPresent) {
            response.sendRedirect("congrad");
        } else {
            response.setContentType("text/html");
            PrintWriter writer = response.getWriter();
            response.getWriter().write("Error. wrong username or login <br>" + FORMSTR);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        response.getWriter().write(FORMSTR);
    }
}
