package vo;

import com.google.gson.Gson;
import org.apache.ibatis.session.SqlSession;
import vo.TableItem;

import java.util.HashMap;
import java.util.Map;

public class forest_2_calculator implements TableItem {
    private float s;
    private float p;
    private String year;
    private String position;
    private float result;

    public forest_2_calculator(float s, float p, String year, String position, float result) {
        this.s = s;
        this.p = p;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public forest_2_calculator(Map jsonMap){
        s=Float.parseFloat(jsonMap.get("s").toString());
        p =Float.parseFloat(jsonMap.get("p").toString());
    }

    @Override
    public String calc() {
        result=s*p;
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
