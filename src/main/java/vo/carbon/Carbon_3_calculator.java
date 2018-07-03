package vo.carbon;

import java.util.Map;

public class Carbon_3_calculator {
    private double a;
    private double f;
    private double c;
    private double r;
    private double b;
    private String year;
    private Map map;

    public Carbon_3_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        f=Double.parseDouble(jsonMap.get("F").toString());
        c=Double.parseDouble(jsonMap.get("C").toString());
        r=Double.parseDouble(jsonMap.get("R").toString());
        b=Double.parseDouble(jsonMap.get("B").toString());
        this.map=jsonMap;
    }
    public Map getMap() {
        return map;
    }
    public double calc(){
        double result =a*c*(1.63*r*b+f);
        map.put("result",result);
        return result;
    }

    public void setYear(String year){
        this.year=year;
        map.put("year",year);
        map.put("position","梁子湖");
    }
}
