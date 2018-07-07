package servlet;

import com.google.gson.Gson;
import dao.Mapper.Carbon_1_Mapper;
import dao.Record;
import dao.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import temp.CurUser;
import temp.TableItemManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RecordServlet",urlPatterns = {"/servlet/RecordServlet"})
public class RecordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
//load时请求，year，position，type
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(0);
        request.setCharacterEncoding("UTF-8");
        String year=request.getParameter("year");
        String username=(String)request.getSession().getAttribute("user");
        String position=request.getParameter("position");
        String type=request.getParameter("type");

        CurUser curUser=new CurUser(username,year,position,type);
        TableItemManager.add(curUser);

        Gson gson=new Gson();
        Record record=new Record(year);
        response.getWriter().print(gson.toJson(record));
    }
}
