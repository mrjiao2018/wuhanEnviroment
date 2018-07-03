package vo.nutriment;

import java.util.Map;

public class Nutriment_2_calculator {
    private double a;
    private double b;
    private double p;
    private String year;
    private Map map;

    public Nutriment_2_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        b=Double.parseDouble(jsonMap.get("B").toString());
        p=Double.parseDouble(jsonMap.get("P").toString());
        this.map=jsonMap;
    }
    public Map getMap() {
        return map;
    }
    public double calc(){
        double result =a*p*b;
        map.put("result",result);
        return result;
    }

    public void setYear(String year){
        this.year=year;
        map.put("year",year);
        map.put("position","梁子湖");
    }
}
