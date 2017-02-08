package irinaff.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Как создать Servlet http://devcolibri.com/4284
 * Created by IFatkullina on 08.02.2017.
 */
//HttpServlet предназначен для написания сервлетов по типу общения клиент-сервер, а именно используя HTTP протокол
public class MainServlet extends HttpServlet {
    @Override
    //метод doGet принимает два параметра:
    //HttpServletRequest req — это запрос, который пришел к сервлету;
    //HttpServletResponse resp — это ответ который даст сервлет.
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //super.doGet(req, resp);
        PrintWriter out = resp.getWriter();
        out.print("<h1>Hello Servlet</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
