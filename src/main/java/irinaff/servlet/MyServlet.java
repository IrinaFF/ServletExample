package irinaff.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IFatkullina on 09.02.2017.
 */
//казывает на то что данный сервлет будет доступет по адресу <URL>/s
@WebServlet("/s")
public class MyServlet extends HttpServlet {
    //HttpServletRequest request — это запрос со стороны клиента;
    // HttpServletResponse response — это ответ со стороны сервера
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //отображать мы будем страничку как html
        response.setContentType("text/html");
        //без JSP
        //создаем врайтер который поможет нам осуществить ответ с сервера
        //PrintWriter out = response.getWriter();
        //отправляем ответ с сервера клиенту
        //out.println("Hello Word");

        //c JSP
        String varTextA = "Hello World!";
        request.setAttribute("textA", varTextA);
        String varTextB = "It JSP.";
        request.setAttribute("textB", varTextB);
        //С помощью RequestDispatcher мы отправляем
        // наш response request клиенту.
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.doPost(request, response);
    }

}

