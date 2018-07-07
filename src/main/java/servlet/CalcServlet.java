package servlet;

import com.google.gson.Gson;
import temp.TableItemManager;
import vo.TableItem;

import javax.servlet.ServletException;
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
import vo.*;

@WebServlet(name = "Servlet",urlPatterns = {"/servlet/CalcServlet"})
public class CalcServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String username=(String) request.getSession().getAttribute("user");

        //储存参数至map
        Enumeration parameterNames = request.getParameterNames();
        Map map=new HashMap<String,String>();
        String className="";
        while(parameterNames.hasMoreElements()) {
            String str=parameterNames.nextElement().toString();
            className=str;
            map.put(str,request.getParameter(str));
        }
        className=className.replace("-","_");
        className  = className.substring(0,1).toUpperCase()+className.substring(1);
        className="vo."+className;
        try {
            Class c= Class.forName(className);
            Method method=c.getMethod("calc",null);
            Constructor<?> constructor = c.getDeclaredConstructor(Map.class);
            constructor.setAccessible(true);

            TableItem o= (TableItem) constructor.newInstance(map);
            double result= (double)method.invoke(o);
            TableItemManager.addItem(username,o);
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
