package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NewServletTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=utf-8");
//        ServletInputStream inputStream = req.getInputStream();
//        int len = -1;
//        byte[] buffer = new byte[1024];
//        while((len = inputStream.read(buffer)) != -1) {
//            System.out.println(buffer);
//        }
        System.out.println(req.getParameter("username"));
        System.out.println(req.getParameter("password"));
        resp.getWriter().write("{\"status\":600}");
    }
}
