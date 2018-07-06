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
    private String position;
    private double result;

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
    }

    public Nutriment_4_calculator(float a, float b, float c1, float c2, float r1, float r2, float r3, float n, float p, float k, String year, String position, float result) {
        this.a = a;
        this.b = b;
        this.c1 = c1;
        this.c2 = c2;
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.n = n;
        this.p = p;
        this.k = k;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public double calc(){
        result =a*b*(n*c1/r1+p*c1/r2+k*c2/r3);
        return result;
    }
    public void setYear(String year){
        this.year=year;
    }
}
