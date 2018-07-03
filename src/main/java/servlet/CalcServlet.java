package servlet;

import calc.CalcService;
import com.google.gson.Gson;
import temp.CurRecords;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "Servlet",urlPatterns = {"/servlet/CalcServlet"})
public class CalcServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        Cookie[] cs = request.getCookies();
        String username=cs[0].getValue();

        Enumeration parameterNames = request.getParameterNames();
        Map map=new HashMap<String,String>();
        String className="";
        while(parameterNames.hasMoreElements()) {
            String str=parameterNames.nextElement().toString();
            className=str;
            map.put(str,request.getParameter(str));
        }
        className=className.replace("-","_");


        try {
            Class c= Class.forName(className);
            Method method=c.getMethod("calc",null);
            Constructor<?> constructor = c.getDeclaredConstructor(Map.class);
            constructor.setAccessible(true);

            Object o=constructor.newInstance(map);
            float result= (float)method.invoke(o);

            CurRecords.add(username,o);
            Map resultMap=new HashMap<String,Float>();
            resultMap.put("result",result);

            Gson gson=new Gson();
            response.getWriter().print(gson.toJson(resultMap));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
