package vo;

import dao.Mapper.Carbon_1_Mapper;
import dao.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import vo.TableItem;

import java.util.Map;

public class Carbon_1_calculator implements TableItem {
    private double a;
    private double r;
    private double b;
    private String year;
    private String position;
    private double result;

    public Carbon_1_calculator(float a, float r, float b, String year, String position, float result) {
        this.a = a;
        this.r = r;
        this.b = b;
        this.year = year;
        this.position=position;
        this.result = result;
    }

    public Carbon_1_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        r =Double.parseDouble(jsonMap.get("Rc").toString());
        b=Double.parseDouble(jsonMap.get("B").toString());
    }

    public double calc(){
        result =1.63*a*b* r;
        return result;
    }

    public void setYear(String year){
        this.year=year;
    }

    public String getYear() {
        return year;
    }

    public void store(){
        SqlSession sqlSession= SessionFactory.getSession();
        Carbon_1_Mapper carbon_1_mapper=sqlSession.getMapper(Carbon_1_Mapper.class);
        carbon_1_mapper.insert(this);
    }
}
