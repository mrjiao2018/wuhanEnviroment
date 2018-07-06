package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TotalServlet",urlPatterns = {"/servlet/TotalServlet"})
public class TotalServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
//总表数据
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String year=request.getParameter("year");
        if (year.equals("2011")){
            String str="[\"11312.40\",\"347417.7\",\"9380.28\",\"9415\",\"753.20\",\"14116.25\",\"24249.73\",\"4589257.50\",\"2804.36\",\"4589257.50\",\"959.15\",\"3763.51\",\"13597.80\",\"14.16\",\"1183.01\",\"263.53\",\"277.69\",\"36978.95\",\"4437.47\",\"72007.15\",\"7200.71\",\"11638.19\",\"168.43\",\"290.45\",\"72.61\",\"116.10\",\"635.36\",\"279.56\",\"686.11\",\"1.10E+23\",\"64.04\",\"1092617.22\",\"68.94\",\"679.89\",\"27195.60\",\"167932830.00\",\"2518.99\",\"29847.57\",\"5135.70\",\"1738.53\",\"53087.30\",\"9000.00\",\"9000.00\",\"86337.03\"]";
            response.getWriter().print(str);
        }else if (year.equals("2015")){
            String str="23\",\"81.86\",\"1396989.89\",\"174.69\",\"869.02\",\"34760.72\",\"214647446.00\",\"3219.71\",\"38236.98\",\"9108.00\",\"2805.40\",\"69414.98\",\"47400.00\",\"47400.00\",\"149307.67\"]";
            response.getWriter().print(str);
        }else {
            response.getWriter().print("[]");
        }
    }
}
