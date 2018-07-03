package vo.nutriment;

import java.util.Map;

public class Nutriment_3_calculator {
    private double a;
    private double b;
    private double k;
    private String year;
    private Map map;

    public Nutriment_3_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        b=Double.parseDouble(jsonMap.get("B").toString());
        k=Double.parseDouble(jsonMap.get("K").toString());
        this.map=jsonMap;
    }
    public Map getMap() {
        return map;
    }
    public double calc(){
        double result =a*k*b;
        map.put("result",result);
        return result;
    }

    public void setYear(String year){
        this.year=year;
        map.put("year",year);
        map.put("position","梁子湖");
    }
}
