package vo;

import com.google.gson.Gson;
import dao.Mapper.Soil_4_Mapper;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.Map;

public class Soil_4_calculator  implements TableItem{
    private double a;
    private double x1;
    private double x2;
    private double k;
    private String year;
    private String position;
    private double result;


    public Soil_4_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        x1=Double.parseDouble(jsonMap.get("X1").toString());
        x2=Double.parseDouble(jsonMap.get("X2").toString());
        k=Double.parseDouble(jsonMap.get("K").toString());
    }

    public Soil_4_calculator(float a, float x1, float x2, float k, String year, String position, float result) {
        this.a = a;
        this.x1 = x1;
        this.x2 = x2;
        this.k = k;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    @Override
    public String calc() {
        result =a*k*(x1-x2);
        Map resultMap=new HashMap<String,Float>();
        resultMap.put("result",result);

        Gson gson=new Gson();
        return gson.toJson(resultMap);
    }

    @Override
    public void store(SqlSession sqlSession) {
        Soil_4_Mapper soil_4_mapper=sqlSession.getMapper(Soil_4_Mapper.class);
        soil_4_mapper.insert(this);
    }

    public void setYear(String year){
        this.year=year;
    }
}
