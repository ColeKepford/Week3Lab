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
public class ArithmetricCalculatorServlet extends HttpServlet 
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
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String first = request.getParameter("first");
       request.setAttribute("first", first);
       
        String second = request.getParameter("second");
       request.setAttribute("second", second);
       
       if(isInt(first) == false || isInt(second) == false)
       {
            request.setAttribute("message", "Result: Invalid");
            request.setAttribute("first", first);
            request.setAttribute("second", second);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
            return;
       }
       int finalNum;
       if(request.getParameter("add") != null)
       {
            finalNum = Integer.parseInt(first) + Integer.parseInt(second);
            request.setAttribute("message", "Result: " + finalNum);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
       }
       else if(request.getParameter("subtract") != null)
       {
            finalNum = Integer.parseInt(first) - Integer.parseInt(second);
             request.setAttribute("message", "Result: " + finalNum);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
       }
       else if(request.getParameter("multiply") != null)
       {
            finalNum = Integer.parseInt(first) * Integer.parseInt(second);
             request.setAttribute("message", "Result: " + finalNum);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
       }
       else if(request.getParameter("modulus") != null)
       {
            finalNum = Integer.parseInt(first) % Integer.parseInt(second);
             request.setAttribute("message", "Result: " + finalNum);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
       }
    }
}
