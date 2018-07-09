package vo;

import com.google.gson.Gson;
import dao.Mapper.Soil_2_Mapper;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.Map;

public class Soil_2_calculator implements TableItem{
    private double a;
    private double x1;
    private double x2;
    private double n;
    private String year;
    private String position;
    private double result;

    public Soil_2_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        x1=Double.parseDouble(jsonMap.get("X1").toString());
        x2=Double.parseDouble(jsonMap.get("X2").toString());
        n=Double.parseDouble(jsonMap.get("N").toString());
    }

    public Soil_2_calculator(float a, float x1, float x2, float n, String year, String position, float result) {
        this.a = a;
        this.x1 = x1;
        this.x2 = x2;
        this.n = n;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public String calc(){
        result =a*n*(x1-x2);
        Map resultMap=new HashMap<String,Float>();
        resultMap.put("result",result);

        Gson gson=new Gson();
        return gson.toJson(resultMap);
    }

    @Override
    public void store(SqlSession sqlSession) {
        Soil_2_Mapper soil_2_mapper=sqlSession.getMapper(Soil_2_Mapper.class);
        soil_2_mapper.insert(this);
    }

    public void setYear(String year){
        this.year=year;
    }
}
