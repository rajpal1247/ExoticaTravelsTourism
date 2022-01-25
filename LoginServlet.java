package demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

 String id,pass;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        id=request.getParameter("i");
        pass=request.getParameter("p");
        boolean status=readFile();
        if(status)
        {
            RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
            rd.forward(request, response);
        }
        else
        {
            RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
            rd.forward(request, response);
        }
    }
    public boolean readFile()
    {
        boolean found = false;
        try(FileReader fr = new FileReader("D:\\raj\\a.txt");
                BufferedReader br = new BufferedReader(fr))
        {
            String s="";
            while((s=br.readLine())!=null)
            {
                String[] data = s.split("-");
                if(data[0].equals(id)&&data[3].equals(pass))
                {
                    found=true;
                    break;
                }
            }
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        return found;
    }
}



