package vo;

import com.google.gson.Gson;
import dao.Mapper.Carbon_2_Mapper;
import dao.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import vo.TableItem;

import java.util.HashMap;
import java.util.Map;

public class Carbon_2_calculator implements TableItem {
    private double a;
    private double f;
    private String year;
    private String position;
    private double result;

    public Carbon_2_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        f=Double.parseDouble(jsonMap.get("F").toString());
    }

    public Carbon_2_calculator(float a, float f, String year,String position, float result) {
        this.a = a;
        this.f = f;
        this.year = year;
        this.result = result;
        this.position=position;
    }

    public String calc(){
        result =a*f;
        Map resultMap=new HashMap<String,Float>();
        resultMap.put("result",result);

        Gson gson=new Gson();
        return gson.toJson(resultMap);
    }

    public void setYear(String year){
        this.year=year;
    }

    public void store(SqlSession sqlSession){
        Carbon_2_Mapper carbon_2_mapper=sqlSession.getMapper(Carbon_2_Mapper.class);
        carbon_2_mapper.insert(this);
    }
}
