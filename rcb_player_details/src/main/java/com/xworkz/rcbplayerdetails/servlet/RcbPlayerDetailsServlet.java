package com.xworkz.rcbplayerdetails.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit")
public class RcbPlayerDetailsServlet extends HttpServlet {

    public RcbPlayerDetailsServlet(){
        System.out.println("RcbPlayerDetailsServlet constructor");
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse resp) throws IOException {
        System.out.println("doGet() invoked");
     String playerName =   request.getParameter("playername");
        System.out.println("player name is:"+playerName);

        // send response back to the client or browser
        resp.setContentType("text/html");
      PrintWriter writer =  resp.getWriter();
      writer.print("<marquee>"+"Successfully accepted the request and now we are seeing the response"+"</marquee>");
      writer.print(playerName);
    }

}
