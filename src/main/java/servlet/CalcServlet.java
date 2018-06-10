package servlet;

import calc.CalcService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "Servlet",urlPatterns = {"/servlet/CalcServlet"})
public class CalcServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
/*        BufferedReader reader = request.getReader();
        String json = reader.readLine();*/
        Enumeration parameterNames = request.getParameterNames();
        Map map=new HashMap<String,String>();
        String method="";
        while(parameterNames.hasMoreElements()) {
            String str=parameterNames.nextElement().toString();
            method=str;
            map.put(str,request.getParameter(str));
        }
        method=method.replace("-","_");
        /*JsonParser jsonParser=new JsonParser();
        JsonElement jsonTree = jsonParser.parse(json);

        for (JsonElement param:
             jsonTree.getAsJsonArray()) {
            map.put(param.getAsJsonObject().get("name").getAsString(),
                    param.getAsJsonObject().get("value").getAsDouble());
        }*/
        //String method=jsonTree.getAsJsonArray().get(jsonTree.getAsJsonArray().size()-1).getAsJsonObject().get("name").getAsString();
        try {
            Method method1=CalcService.class.getMethod(method,Map.class);
            double result=(Double) method1.invoke(CalcService.class.newInstance(),map);
            PrintWriter out =response.getWriter();
            System.out.println(result);
            out.write("{\"result\":"+result+"}");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
