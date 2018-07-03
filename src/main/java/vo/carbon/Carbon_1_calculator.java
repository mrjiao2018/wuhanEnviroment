package vo.carbon;

import java.util.Map;

public class Carbon_1_calculator {
    private double a;
    private double rc;
    private double b;
    private String year;
    private Map map;

    public Carbon_1_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        rc=Double.parseDouble(jsonMap.get("Rc").toString());
        b=Double.parseDouble(jsonMap.get("B").toString());
        this.map=jsonMap;
    }

    public double calc(){
        double result =1.63*a*b*rc;
        map.put("result",result);
        return result;
    }

    public void setYear(String year){
        this.year=year;
        map.put("year",year);
        map.put("position","梁子湖");
    }

    public Map getMap() {
        return map;
    }

    public String getYear() {
        return year;
    }
}
