package demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegistrationServlet", urlPatterns = {"/RegistrationServlet"})
public class RegistrationServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
            
        String un,eml,cn,p;
        
    
        un=request.getParameter("u");
        eml=request.getParameter("e");
        cn=request.getParameter("c");
        p=request.getParameter("p");
        
        RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
        rd.forward(request, response);
    
        try(FileWriter fw = new FileWriter("D:\\raj\\a.txt",true);
                BufferedWriter bw = new BufferedWriter(fw))
        {
            bw.write(un+"-"+eml+"-"+cn+"-"+p);
            bw.newLine();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        response.sendRedirect("LoginPage.jsp");    
    }
}
