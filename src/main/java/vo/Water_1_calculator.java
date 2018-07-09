package vo;

import com.google.gson.Gson;
import dao.Mapper.Water_1_Mapper;
import dao.SessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.Map;

public class Water_1_calculator implements TableItem{
    private double a;
    private double p;
    private double e;
    private double c;
    private String year;
    private String position;
    private double result;

    public Water_1_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        p=Double.parseDouble(jsonMap.get("P").toString());
        e=Double.parseDouble(jsonMap.get("E").toString());
        c=Double.parseDouble(jsonMap.get("C").toString());
    }

    public Water_1_calculator(float a, float p, float e, float c, String year, String position, float result) {
        this.a = a;
        this.p = p;
        this.e = e;
        this.c = c;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public String calc(){
        result =10*a*(p-e-c);
        Map resultMap=new HashMap<String,Float>();
        resultMap.put("result",result);

        Gson gson=new Gson();
        return gson.toJson(resultMap);
    }

    @Override
    public void store(SqlSession sqlSession) {
        Water_1_Mapper water_1_mapper=sqlSession.getMapper(Water_1_Mapper.class);
        water_1_mapper.insert(this);
    }

    public void setYear(String year){
        this.year=year;
    }
}
