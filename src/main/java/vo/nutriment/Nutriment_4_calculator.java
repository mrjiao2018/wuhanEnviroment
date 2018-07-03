package vo.nutriment;

import java.util.Map;

public class Nutriment_4_calculator {
    private double a;
    private double b;
    private double c1;
    private double c2;
    private double r1;
    private double r2;
    private double r3;
    private double n;
    private double p;
    private double k;
    private String year;
    private Map map;

    public Nutriment_4_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        b=Double.parseDouble(jsonMap.get("B").toString());
        c1=Double.parseDouble(jsonMap.get("C1").toString());
        c2=Double.parseDouble(jsonMap.get("C2").toString());
        r1=Double.parseDouble(jsonMap.get("R1").toString());
        r2=Double.parseDouble(jsonMap.get("R2").toString());
        r3=Double.parseDouble(jsonMap.get("R3").toString());
        n=Double.parseDouble(jsonMap.get("N").toString());
        p=Double.parseDouble(jsonMap.get("P").toString());
        k=Double.parseDouble(jsonMap.get("K").toString());
        this.map=jsonMap;
    }

    public double calc(){
        double result =a*b*(n*c1/r1+p*c1/r2+k*c2/r3);
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
