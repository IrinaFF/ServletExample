package irinaff.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Как создать Servlet http://devcolibri.com/4284
 * http://tomcat.apache.org/download-80.cgi v 8.5.11
 * http://apache-mirror.rbc.ru/pub/apache/tomcat/tomcat-8/v8.5.11/bin/apache-tomcat-8.5.11-windows-x64.zip
 * Created by IFatkullina on 08.02.2017.
 */
//способ регистрации сервлетов без web.xml
    //Данная аннотация регистрирует сервлет в контексте приложения, это тоже самое что мы делали в web.xml
    //Аннотация принимает как параметр строку, именно эта строка соответствует тегу url-pattern, тоесть это URL по которому будет доступен сервлет
    //в pom.xml и в maven-war-plugin добавляем свойство которое делает не обязательным web.xml
@WebServlet("/h")
//HttpServlet предназначен для написания сервлетов по типу общения клиент-сервер, а именно используя HTTP протокол
public class MyServletA extends HttpServlet {
    @Override
    //метод doGet принимает два параметра:
    //HttpServletRequest req — это запрос, который пришел к сервлету;
    //HttpServletResponse resp — это ответ который даст сервлет.
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //super.doGet(req, resp);
        String message = "If you read that, Servlet working!";
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
