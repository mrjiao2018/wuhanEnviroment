package vo;

import com.google.gson.Gson;
import dao.Mapper.Pollution_5_Mapper;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.Map;

public class Pollution_5_calculator implements TableItem {
    private double a;
    private double q;
    private String year;
    private String position;
    private double result;

    public Pollution_5_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        q=Double.parseDouble(jsonMap.get("Q").toString());
    }

    public Pollution_5_calculator(float a, float q, String year, String position, float result) {
        this.a = a;
        this.q = q;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public String calc(){
        result =a*q;
        Map resultMap=new HashMap<String,Float>();
        resultMap.put("result",result);

        Gson gson=new Gson();
        return gson.toJson(resultMap);
    }

    @Override
    public void store(SqlSession sqlSession) {
        Pollution_5_Mapper pollution_5_mapper=sqlSession.getMapper(Pollution_5_Mapper.class);
        pollution_5_mapper.insert(this);
    }

    public void setYear(String year){
        this.year=year;
    }
}
