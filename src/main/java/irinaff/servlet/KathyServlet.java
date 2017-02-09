package irinaff.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Irina on 09.02.2017.
 */
@WebServlet("/")
public class KathyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String title = "PhraseOMatic has generated the following phrase.";
        resp.setContentType ("text/html ; charset=utf-8");
        PrintWriter out = resp.getWriter();

        out.println("<html><head>");
        //out.println("<meta charset=\"utf-8\">");
        out.println("<title>PhraseOmatic</title>");
        out.println("</head></body>");
        out.println("<h1>" + title + "</h1>");
        out.println("<p>" + PhraseOMatic.makePhrase());
        out.println("<p><a href=\"irinaff/servlet/KathyServlet\">Coздать другую фразу</а></р>") ;
        out.println("</body></html>");
        out.close();

    }
}
