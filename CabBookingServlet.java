package demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "CabBookingServlet", urlPatterns = {"/CabBookingServlet"})
public class CabBookingServlet extends HttpServlet {    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        HttpSession session=request.getSession();
        String hotel=request.getParameter("hotel");
        String noofdays=request.getParameter("noofdays");
        session.setAttribute("hotel","hotel");
        session.setAttribute("noofdays","noofdays");
        try
        {
            out.println("<title>Tour Package Booking Page</title>");
            out.println("<div align='right'>");
            out.println("<div align='right'>");
            out.println("<a href='LogoutServlet'>Logout</a>");
            out.println("</div>");
            out.println("<table>");
            out.println("<form action='Tour Package Servlet' method='post'>");
            out.println("<tr><td><h3>Tour Package Booking</h3></td></tr>");
            out.println("<tr><td>Select a Cab Service</td>");
            out.println("<td><select name='cab'>");
            out.println("<option value='Select'>Select<option>");
            out.println("<option value='Royal'>Royal<option>");
            out.println("<option value='Kangaroo'>Kangaroo<option>");
            out.println("<option value='Derena'>Derena<option>");
            out.println("<option value='ACE'>ACE<option>");
            out.println("<option value='Hiliton'>Hiliton<option></select></td>");
            out.println("<tr><td><input type='submit' value='Submit'></td>");
            out.println("</form>");
            out.println("<form action='HotelBookingServlet' method='post'>");
            out.println("<td><input type='submit' value='Back'></td></tr>");
            out.println("</form>");
            out.println("</table>");            
        }
        finally
        {
            out.close();
        }
    }
}
