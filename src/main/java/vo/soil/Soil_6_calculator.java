package vo.soil;

import java.util.Map;

public class Soil_6_calculator {
    private double a;
    private double x1;
    private double x2;
    private double c1;
    private double c2;
    private double c3;
    private double r1;
    private double r2;
    private double r3;
    private double n;
    private double p;
    private double k;
    private double m;
    private String year;
    private Map map;

    public Soil_6_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        x1=Double.parseDouble(jsonMap.get("X1").toString());
        x2=Double.parseDouble(jsonMap.get("X2").toString());
        c1=Double.parseDouble(jsonMap.get("C1").toString());
        c2=Double.parseDouble(jsonMap.get("C2").toString());
        c3=Double.parseDouble(jsonMap.get("C3").toString());
        r1=Double.parseDouble(jsonMap.get("R1").toString());
        r2=Double.parseDouble(jsonMap.get("R2").toString());
        r3=Double.parseDouble(jsonMap.get("R3").toString());
        n=Double.parseDouble(jsonMap.get("N").toString());
        p=Double.parseDouble(jsonMap.get("P").toString());
        k=Double.parseDouble(jsonMap.get("K").toString());
        m=Double.parseDouble(jsonMap.get("M").toString());

        this.map=jsonMap;
    }
    public Map getMap() {
        return map;
    }
    public double calc(){
        double result =a*(x2-x1)*(n*c1/r1+p*c1/r2+k*c2/r3+ m*c3);
        map.put("result",result);
        return result;
    }

    public void setYear(String year){
        this.year=year;
        map.put("year",year);
        map.put("position","梁子湖");
    }
}
