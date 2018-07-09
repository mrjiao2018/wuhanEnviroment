package vo;

import com.google.gson.Gson;
import dao.Mapper.Nutriment_2_Mapper;
import org.apache.ibatis.session.SqlSession;
import vo.TableItem;

import java.util.HashMap;
import java.util.Map;

public class Nutriment_2_calculator implements TableItem {
    private double a;
    private double b;
    private double p;
    private String year;
    private String position;
    private double result;

    public Nutriment_2_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        b=Double.parseDouble(jsonMap.get("B").toString());
        p=Double.parseDouble(jsonMap.get("P").toString());
    }

    public Nutriment_2_calculator(float a, float b, float p, String year, String position, float result) {
        this.a = a;
        this.b = b;
        this.p = p;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public String calc(){
        result =a*p*b;
        Map resultMap=new HashMap<String,Float>();
        resultMap.put("result",result);

        Gson gson=new Gson();
        return gson.toJson(resultMap);
    }

    @Override
    public void store(SqlSession sqlSession) {
        Nutriment_2_Mapper nutriment_2_mapper=sqlSession.getMapper(Nutriment_2_Mapper.class);
        nutriment_2_mapper.insert(this);
    }

    public void setYear(String year){
        this.year=year;
    }
}
