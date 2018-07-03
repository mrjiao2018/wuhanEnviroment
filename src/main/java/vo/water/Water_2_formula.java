package vo.water;

import java.util.Map;

public class Water_2_formula {
    private double a;
    private double p;
    private double e;
    private double c;
    private double cKu;
    private String year;
    private Map map;

    public Water_2_formula(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        p=Double.parseDouble(jsonMap.get("P").toString());
        e=Double.parseDouble(jsonMap.get("E").toString());
        c=Double.parseDouble(jsonMap.get("C").toString());
        cKu=Double.parseDouble(jsonMap.get("Cku").toString());
        this.map=jsonMap;
    }
    public Map getMap() {
        return map;
    }
    public double calc(){
        double result =10*cKu*a*(p-e-c);
        map.put("result",result);
        return result;
    }

    public void setYear(String year){
        this.year=year;
        map.put("year",year);
        map.put("position","梁子湖");
    }
}
