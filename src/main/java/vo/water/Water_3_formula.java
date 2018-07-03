package vo.water;

import java.util.Map;

public class Water_3_formula {
    private double a;
    private double p;
    private double e;
    private double c;
    private double k;
    private String year;
    private Map map;

    public Water_3_formula(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        p=Double.parseDouble(jsonMap.get("P").toString());
        e=Double.parseDouble(jsonMap.get("E").toString());
        c=Double.parseDouble(jsonMap.get("C").toString());
        k=Double.parseDouble(jsonMap.get("K").toString());
        this.map=jsonMap;
    }

    public double calc(){
        double result =10*k*a*(p-e-c);
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
