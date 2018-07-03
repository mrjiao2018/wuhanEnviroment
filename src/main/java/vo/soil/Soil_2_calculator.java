package vo.soil;

import java.util.Map;

public class Soil_2_calculator {
    private double a;
    private double x1;
    private double x2;
    private double n;
    private String year;
    private Map map;

    public Soil_2_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        x1=Double.parseDouble(jsonMap.get("X1").toString());
        x2=Double.parseDouble(jsonMap.get("X2").toString());
        n=Double.parseDouble(jsonMap.get("N").toString());
        this.map=jsonMap;
    }
    public Map getMap() {
        return map;
    }
    public double calc(){
        double result =a*n*(x1-x2);
        map.put("result",result);
        return result;
    }

    public void setYear(String year){
        this.year=year;
        map.put("year",year);
        map.put("position","梁子湖");
    }
}
