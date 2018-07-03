package servlet;

import com.google.gson.Gson;
import dao.LoginDao;
import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "LoginServlet",urlPatterns = {"/servlet/LoginServlet"})
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String username=request.getParameter("username");
        String password=request.getParameter("password");

        LoginDao loginDao=new LoginDao();
        Map result=new HashMap<String,Integer>();
        if (loginDao.getUser(username,password)!=null){
            result.put("status",600);
            response.setHeader("Set-Cookie","username="+username);
        }else {
            result.put("status",700);
        }


        Gson gson=new Gson();
        response.getWriter().print(gson.toJson(result));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
