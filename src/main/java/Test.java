import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class Test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=utf-8");
        Enumeration parameterNames = req.getParameterNames();
        while(parameterNames.hasMoreElements()) {
            String str;
            System.out.println("parameter name : " + (str = (String)parameterNames.nextElement()));
            System.out.println("parameter value : " + req.getParameter(str));
        }
        Stu stu = new Stu("123");
        String result = JSON.toJSONString(stu);
        resp.getWriter().write(result);
    }
}


class Stu{
    public String result;

    public Stu(String result) {
        this.result = result;
    }
}
