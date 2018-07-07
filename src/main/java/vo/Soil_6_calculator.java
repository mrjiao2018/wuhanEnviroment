package vo;

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
    private String position;
    private double result;

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

    }

    public Soil_6_calculator(float a, float x1, float x2, float c1, float c2, float c3, float r1, float r2, float r3, float n, float p, float k, float m, String year, String position, float result) {
        this.a = a;
        this.x1 = x1;
        this.x2 = x2;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.n = n;
        this.p = p;
        this.k = k;
        this.m = m;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public double calc(){
        result =a*(x2-x1)*(n*c1/r1+p*c1/r2+k*c2/r3+ m*c3);
        return result;
    }

    public void setYear(String year){
        this.year=year;
    }
}
