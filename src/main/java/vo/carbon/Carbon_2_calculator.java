package vo.carbon;

import java.util.Map;

public class Carbon_2_calculator {
    private double a;
    private double f;
    private String year;
    private Map map;

    public Carbon_2_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        f=Double.parseDouble(jsonMap.get("F").toString());
        map=jsonMap;
    }
    public Map getMap() {
        return map;
    }
    public double calc(){
        double result =a*f;
        map.put("result",result);
        return result;
    }

    public void setYear(String year){
        this.year=year;
        map.put("year",year);
        map.put("position","梁子湖");
    }
}
