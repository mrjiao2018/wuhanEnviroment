package servlet;

import dao.Mapper.Carbon_1_Mapper;
import dao.SessionFactory;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InfoServlet",urlPatterns = {"/servlet/InfoServlet"})
public class InfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String year=request.getParameter("year");
        SqlSession sqlSession= SessionFactory.getSession();
        Carbon_1_Mapper carbon_1_mapper=sqlSession.getMapper(Carbon_1_Mapper.class);
        response.getWriter().println(carbon_1_mapper.select(year).getYear());
    }
}
