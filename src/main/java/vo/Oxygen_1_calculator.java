package vo;

import com.google.gson.Gson;
import dao.Mapper.Oxygen_1_Mapper;
import org.apache.ibatis.session.SqlSession;
import vo.TableItem;

import java.util.HashMap;
import java.util.Map;

public class Oxygen_1_calculator implements TableItem {
    private double a;
    private double b;
    private String year;
    private String position;
    private double result;

    public Oxygen_1_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        b=Double.parseDouble(jsonMap.get("B").toString());
    }

    public Oxygen_1_calculator(float a, float b, String year, String position, float result) {
        this.a = a;
        this.b = b;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public String calc(){
        result =1.19*a*b;
        Map resultMap=new HashMap<String,Float>();
        resultMap.put("result",result);

        Gson gson=new Gson();
        return gson.toJson(resultMap);
    }

    @Override
    public void store(SqlSession sqlSession) {
        Oxygen_1_Mapper oxygen_1_mapper=sqlSession.getMapper(Oxygen_1_Mapper.class);
        oxygen_1_mapper.insert(this);
    }

    public void setYear(String year){
        this.year=year;
    }
}
