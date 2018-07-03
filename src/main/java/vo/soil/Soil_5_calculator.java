package vo.soil;

import java.util.Map;

public class Soil_5_calculator {
    private double a;
    private double x1;
    private double x2;
    private double ctu;
    private double p;
    private String year;
    private Map map;

    public Soil_5_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        x1=Double.parseDouble(jsonMap.get("X1").toString());
        x2=Double.parseDouble(jsonMap.get("X2").toString());
        ctu=Double.parseDouble(jsonMap.get("CTu").toString());
        p=Double.parseDouble(jsonMap.get("p").toString());
        this.map=jsonMap;
    }
    public Map getMap() {
        return map;
    }
    public double calc(){
        double result =a*ctu*(x1-x2)/p;
        map.put("result",result);
        return result;
    }

    public void setYear(String year){
        this.year=year;
        map.put("year",year);
        map.put("position","梁子湖");
    }
}
