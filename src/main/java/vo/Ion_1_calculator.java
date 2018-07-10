package vo;

import com.google.gson.Gson;
import dao.Mapper.Ion_1_Mapper;
import org.apache.ibatis.session.SqlSession;
import vo.TableItem;

import java.util.HashMap;
import java.util.Map;

public class Ion_1_calculator implements TableItem {
    private double a;
    private double h;
    private double l;
    private double q;
    private String year;
    private String position;
    private double result;

    public Ion_1_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        h=Double.parseDouble(jsonMap.get("H").toString());
        l=Double.parseDouble(jsonMap.get("L").toString());
        q=Double.parseDouble(jsonMap.get("Q").toString());
    }

    public Ion_1_calculator(float a, float h, float l, float q, String year, String position, float result) {
        this.a = a;
        this.h = h;
        this.l = l;
        this.q = q;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public String calc(){
        result =5.256E15*q*a*h/l;
        Map resultMap=new HashMap<String,Float>();
        resultMap.put("result",result);

        Gson gson=new Gson();
        return gson.toJson(resultMap);
    }

    @Override
    public void store(SqlSession sqlSession) {
        Ion_1_Mapper ion_1_mapper=sqlSession.getMapper(Ion_1_Mapper.class);
        ion_1_mapper.insert(this);
    }

    public void setYear(String year){
        this.year=year;
    }
}
