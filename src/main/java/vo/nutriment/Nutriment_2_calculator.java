package vo.nutriment;

import java.util.Map;

public class Nutriment_2_calculator {
    private double a;
    private double b;
    private double p;
    private String year;
    private String position;
    private double result;

    public Nutriment_2_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        b=Double.parseDouble(jsonMap.get("B").toString());
        p=Double.parseDouble(jsonMap.get("P").toString());
    }

    public Nutriment_2_calculator(float a, float b, float p, String year, String position, float result) {
        this.a = a;
        this.b = b;
        this.p = p;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public double calc(){
        result =a*p*b;
        return result;
    }

    public void setYear(String year){
        this.year=year;
    }
}
