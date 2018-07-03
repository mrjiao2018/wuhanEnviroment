package servlet;

import dao.Mapper.RecordMapper;
import dao.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import temp.CurRecords;
import temp.Record;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

@WebServlet(name = "SubmitServlet",urlPatterns = {"servlet/SubmitServlet"})
public class SubmitServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getCookies()[0].getValue();
        SqlSession sqlSession=SessionFactory.getSession();
        RecordMapper mapper=sqlSession.getMapper(RecordMapper.class);
        Record record= CurRecords.getRecord(username);

        Field[] fields=record.getClass().getFields();
        for (int i=0;i<fields.length;i++){
            String name=fields[i].getName();
            name  = name.substring(0,1).toUpperCase()+name.substring(1);
            try {
                Method method=record.getClass().getMethod("get"+name,null);
                Object o=method.invoke(record,null);
                if (o!=null){
                    Map map= (Map) o.getClass().getMethod("getMap",null).invoke(o,null);
                    mapper.insert(name,map);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
