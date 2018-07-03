package vo.soil;

import java.util.Map;

public class Soil_3_calculator {
    private double a;
    private double x1;
    private double x2;
    private double p;
    private String year;
    private Map map;

    public Soil_3_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        x1=Double.parseDouble(jsonMap.get("X1").toString());
        x2=Double.parseDouble(jsonMap.get("X2").toString());
        p=Double.parseDouble(jsonMap.get("P").toString());
        this.map=jsonMap;
    }
    public Map getMap() {
        return map;
    }
    public double calc(){
        double result =a*p*(x1-x2);
        map.put("result",result);
        return result;
    }

    public void setYear(String year){
        this.year=year;
        map.put("year",year);
        map.put("position","梁子湖");
    }
}
