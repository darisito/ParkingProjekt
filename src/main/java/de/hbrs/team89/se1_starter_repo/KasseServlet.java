package de.hbrs.team89.se1_starter_repo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@WebServlet(name = "kasse", value = "/kasse")
public class KasseServlet extends Level1Servlet {

    private String ticketToPay;
    private float kassenBetrag;
    final private String username = "admin";
    final private String password = "admin";
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String cmd = request.getParameter("cmd");
        //Autor Darius
        String amount = request.getParameter("amount");
        if(request.getParameter("pay-ticket") != null){
            ticketToPay = request.getParameter("pay-ticket");
        }
        //gibt get anfragen auf server console aus
        System.out.println(cmd + " requested: " + request.getQueryString());

        //meins
        String[] requestParamString = request.getQueryString().split("=");
        String command = requestParamString[0];
        String param = requestParamString[1];

        out.println("<br>Ticket: "+ticketToPay);
        CarIF car = cars().stream().filter(carIF -> carIF.getTicket().equals(ticketToPay) ).findFirst().orElse(null);

        if(request.getParameter("cash") != null){
            int cash = new Scanner(request.getParameter("cash")).nextInt();
            car.setPrice(car.getPrice()-cash);
            kassenBetrag += cash;
        }

        //out.println("<br><br> car : "+car.toString());
        out.println("<br><br>Car Nr :"+car.getNr());
        out.println("<br> Car Category :"+car.getCategory());
        out.println("<br> Entry timestamp :"+car.getBegin());
        out.println("<br> Exit timestamp :"+car.getEnd());
        out.println("<br> Duration :"+car.getDuration());
        out.println("<br> Space slot :"+car.getSpace());

        out.println("<br><br> Amount to Pay: <h2>"+car.getPrice()+"</h2>");
        out.println(
                "<br> " +
                        "<form method=\"get\">"+
                        "<input type=\"number\" name=\"cash\" >"+
                        "<input type=\"submit\" value=\"pay\">"+
                        "</form>");
        out.println("");

        out.println(
                "<br><br><br><br><br>" +
                        "<form method=\"get\">"+
                        "<label for=\"username\">Username</label>"+
                        "<input type=\"text\" name=\"username\" >"+
                        "<label for=\"password\">Password</label>"+
                        "<input type=\"text\" name=\"password\" >"+
                        "<input type=\"submit\" value=\"authenticate\">"+
                        "</form>");
        if(request.getParameter("username").equals(this.username) && request.getParameter("password").equals(this.password)){
            out.println("<h3>Kasse Betrag : "+kassenBetrag+"</h3>");
        }
        out.println("");




    }
}
