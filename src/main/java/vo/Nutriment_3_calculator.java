package vo;

import com.google.gson.Gson;
import dao.Mapper.Nutriment_3_Mapper;
import org.apache.ibatis.session.SqlSession;
import vo.TableItem;

import java.util.HashMap;
import java.util.Map;

public class Nutriment_3_calculator implements TableItem {
    private double a;
    private double b;
    private double k;
    private String year;
    private String position;
    private double result;

    public Nutriment_3_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        b=Double.parseDouble(jsonMap.get("B").toString());
        k=Double.parseDouble(jsonMap.get("K").toString());
    }

    public Nutriment_3_calculator(float a, float b, float k, String year, String position, float result) {
        this.a = a;
        this.b = b;
        this.k = k;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public String calc(){
        result =a*k*b;
        Map resultMap=new HashMap<String,Float>();
        resultMap.put("result",result);

        Gson gson=new Gson();
        return gson.toJson(resultMap);
    }

    @Override
    public void store(SqlSession sqlSession) {
        Nutriment_3_Mapper nutriment_3_mapper=sqlSession.getMapper(Nutriment_3_Mapper.class);
        nutriment_3_mapper.insert(this);
    }

    public void setYear(String year){
        this.year=year;
    }
}
