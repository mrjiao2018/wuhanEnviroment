package vo.oxygen;

import java.util.Map;

public class Oxygen_2_calculator {
    private double a;
    private double b;
    private double c;
    private String year;
    private String position;
    private double result;

    public Oxygen_2_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        b=Double.parseDouble(jsonMap.get("B").toString());
        c=Double.parseDouble(jsonMap.get("C").toString());
    }

    public Oxygen_2_calculator(float a, float b, float c, String year, String position, float result) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public double calc(){
        result =1.19*c*a*b;
        return result;
    }

    public void setYear(String year){
        this.year=year;
    }
}
