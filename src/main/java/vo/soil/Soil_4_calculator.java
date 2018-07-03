package vo.soil;

import java.util.Map;

public class Soil_4_calculator {
    private double a;
    private double x1;
    private double x2;
    private double k;
    private String year;
    private Map map;

    public Soil_4_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        x1=Double.parseDouble(jsonMap.get("X1").toString());
        x2=Double.parseDouble(jsonMap.get("X2").toString());
        k=Double.parseDouble(jsonMap.get("K").toString());
        this.map=jsonMap;
    }

    public double clac(){
        double result =a*k*(x1-x2);
        map.put("result",result);
        return result;
    }
    public Map getMap() {
        return map;
    }
    public void setYear(String year){
        this.year=year;
        map.put("year",year);
        map.put("position","梁子湖");
    }
}
