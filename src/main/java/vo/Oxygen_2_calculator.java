package vo;

import com.google.gson.Gson;
import dao.Mapper.Oxygen_2_Mapper;
import org.apache.ibatis.session.SqlSession;
import vo.TableItem;

import java.util.HashMap;
import java.util.Map;

public class Oxygen_2_calculator implements TableItem {
    private double a;
    private double b;
    private double c;
    private String year;
    private String position;
    private double result;

    public Oxygen_2_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        b=Double.parseDouble(jsonMap.get("B").toString());
        c=Double.parseDouble(jsonMap.get("C").toString());
    }

    public Oxygen_2_calculator(float a, float b, float c, String year, String position, float result) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public String calc(){
        result =1.19*c*a*b;
        Map resultMap=new HashMap<String,Float>();
        resultMap.put("result",result);

        Gson gson=new Gson();
        return gson.toJson(resultMap);
    }

    @Override
    public void store(SqlSession sqlSession) {
        Oxygen_2_Mapper oxygen_2_mapper=sqlSession.getMapper(Oxygen_2_Mapper.class);
        oxygen_2_mapper.insert(this);
    }

    public void setYear(String year){
        this.year=year;
    }
}
