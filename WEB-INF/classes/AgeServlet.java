import java.io.*;
import javax.servlet.*;

public class AgeServlet extends GenericServlet
{
   public void service(ServletRequest req, ServletResponse res)
    {
        
       try
         {
             String s1=req.getParameter("age");

             int age=Integer.parseInt(s1);

            PrintWriter pw=res.getWriter();

              pw.println("<html><body bgcolor=lightblue text=green><center><h1>");
              if(age>0 && age<100){
                    
                     if(age>=18)
                      {
                         pw.println("Eligible for vote");  
                      }
                     else{
                           pw.println("Not Eligible for vote");  

                      }
                }
               else{
                   if(age<0)
                    {
                        pw.println("Age can not be a negative");  

                    }
                   else{
                         pw.println("Invalid age");  
                
                       }
               }
                
               pw.println("</h1></center></body></html>");
         }
       catch(Exception e)
        {
             System.out.println(e);
        }
    }
}