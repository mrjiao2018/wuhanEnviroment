package vo.oxygen;

import java.util.Map;

public class Oxygen_2_calculator {
    private double a;
    private double b;
    private double c;
    private String year;
    private Map map;

    public Oxygen_2_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        b=Double.parseDouble(jsonMap.get("B").toString());
        c=Double.parseDouble(jsonMap.get("C").toString());
        this.map=jsonMap;
    }
    public Map getMap() {
        return map;
    }
    public double calc(){
        double result =1.19*c*a*b;
        map.put("result",result);
        return result;
    }

    public void setYear(String year){
        this.year=year;
        map.put("year",year);
        map.put("position","梁子湖");
    }
}
