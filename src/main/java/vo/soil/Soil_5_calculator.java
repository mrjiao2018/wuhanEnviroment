package vo.soil;

import java.util.Map;

public class Soil_5_calculator {
    private double a;
    private double x1;
    private double x2;
    private double ctu;
    private double p;
    private String year;
    private String position;
    private double result;

    public Soil_5_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        x1=Double.parseDouble(jsonMap.get("X1").toString());
        x2=Double.parseDouble(jsonMap.get("X2").toString());
        ctu=Double.parseDouble(jsonMap.get("CTu").toString());
        p=Double.parseDouble(jsonMap.get("p").toString());
    }

    public Soil_5_calculator(float a, float x1, float x2, float ctu, float p, String year, String position, float result) {
        this.a = a;
        this.x1 = x1;
        this.x2 = x2;
        this.ctu = ctu;
        this.p = p;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public double calc(){
        result =a*ctu*(x1-x2)/p;
        return result;
    }

    public void setYear(String year){
        this.year=year;

    }
}
