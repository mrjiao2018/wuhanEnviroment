package vo.lon;

import java.util.Map;

public class Ion_1_calculator {
    private double a;
    private double h;
    private double l;
    private double q;
    private String year;
    private Map map;

    public Ion_1_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        h=Double.parseDouble(jsonMap.get("H").toString());
        l=Double.parseDouble(jsonMap.get("L").toString());
        q=Double.parseDouble(jsonMap.get("Q").toString());
        this.map=jsonMap;
    }
    public Map getMap() {
        return map;
    }
    public double calc(){
        double result =5.256E15*q*a*h/l;
        map.put("result",result);
        return result;
    }

    public void setYear(String year){
        this.year=year;
        map.put("year",year);
        map.put("position","梁子湖");
    }
}
