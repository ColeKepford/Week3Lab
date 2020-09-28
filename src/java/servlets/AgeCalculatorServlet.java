/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cocog
 */
public class AgeCalculatorServlet extends HttpServlet 
{
     public static boolean isInt(String number)
    {
        if (number == null)
        {
            return false;
        }
        try 
        {
        int i = Integer.parseInt(number);
        }
        catch (NumberFormatException nfe) 
        {
        return false;
        }
    return true;
    }
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       String age = request.getParameter("age");
       request.setAttribute("age", age);
       
       if(isInt(age) == false)
       {
           request.setAttribute("message", "Please enter your current age");
           request.setAttribute("age", age);
           
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
           return;
       }
        request.setAttribute("message", "Your age next birthday will be " + (Integer.parseInt(age) + 1));
       getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
            .forward(request, response);
       
       
    }
}
