package vo;

import com.google.gson.Gson;
import org.apache.ibatis.session.SqlSession;
import vo.TableItem;

import java.util.HashMap;
import java.util.Map;

public class forest_1_calculator implements TableItem {
    private float m;
    private float f;
    private float am;
    private String year;
    private String position;
    private float result;

    public forest_1_calculator(float m, float f, float am, String year, String position, float result) {
        this.m = m;
        this.f = f;
        this.am = am;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public forest_1_calculator(Map jsonMap){
        m=Float.parseFloat(jsonMap.get("M").toString());
        f =Float.parseFloat(jsonMap.get("F").toString());
        am=Float.parseFloat(jsonMap.get("Am").toString());
    }

    @Override
    public String calc() {
        result=m*f*am;
        Map resultMap=new HashMap<String,Float>();
        resultMap.put("result",result);

        Gson gson=new Gson();
        return gson.toJson(resultMap);
    }

    @Override
    public void store(SqlSession sqlSession) {

    }

    @Override
    public void setYear(String year) {
        this.year=year;
    }
}
