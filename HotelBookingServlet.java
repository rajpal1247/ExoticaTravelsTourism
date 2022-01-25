package demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "HotelBookingServlet", urlPatterns = {"/HotelBookingServlet"})
public class HotelBookingServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        HttpSession session=request.getSession();
        
        try
        {           
            System.out.println("1");
            String destination=request.getParameter("destination");
            session.setAttribute("destination","destination");
            out.println("<ttitle>Tour Package Booking Page</title>");
            out.println("<div align='right'>");
            out.println("<a href='LogoutServlet'>Logout</a>");
            out.println("</div>");
            out.println("<table>");
            out.println("<form action='HotelBookingPage.jsp' method='post'>");
            out.println("<tr><td><h3>Tour Package Booking</tr></td></h3>");
            out.println("<tr><td>Select a hotel</td>");
            out.println("<td><select name='hotel'>");
            out.println("<option value='Select'>Select</option>");
            out.println("<option value='Jetwing'>Jetwing</option>");
            out.println("<option value='Kells'>Kells</option>");
            out.println("<option value='Heritance'>Heritance</option>");
            out.println("<option value='Devon'>Devon</option>");
            out.println("<option value='Hiliton'>Hiliton</option></select></td>");
            out.println("<tr><td>Number of Days</td>");
            out.println("<td><input type='text' name='noofdays'/></td>");
            out.println("<tr><td><input type='submit' value='Submit'/></td>");
            out.println("</form>");
            out.println("<form action='CreateanAccount.jsp' method='post'>");
            out.println("<td><input type='submit' value='Back'/></td></tr>");
            out.println("</form>");
            out.println("</table>");

        }
        finally
        {
            out.close();
        }
    }
}
