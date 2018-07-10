package vo;

import com.google.gson.Gson;
import dao.Mapper.Nutriment_1_Mapper;
import org.apache.ibatis.session.SqlSession;
import vo.TableItem;

import java.util.HashMap;
import java.util.Map;

public class Nutriment_1_calculator implements TableItem {
    private double a;
    private double b;
    private double n;
    private String year;
    private String position;
    private double result;

    public Nutriment_1_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        b=Double.parseDouble(jsonMap.get("B").toString());
        n=Double.parseDouble(jsonMap.get("N").toString());
    }

    public Nutriment_1_calculator(float a, float b, float n, String year, String position, float result) {
        this.a = a;
        this.b = b;
        this.n = n;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public String calc(){
        result =a*n*b;
        Map resultMap=new HashMap<String,Float>();
        resultMap.put("result",result);

        Gson gson=new Gson();
        return gson.toJson(resultMap);
    }

    @Override
    public void store(SqlSession sqlSession) {
        Nutriment_1_Mapper nutriment_1_mapper=sqlSession.getMapper(Nutriment_1_Mapper.class);
        nutriment_1_mapper.insert(this);
    }

    public void setYear(String year){
        this.year=year;
    }
}
