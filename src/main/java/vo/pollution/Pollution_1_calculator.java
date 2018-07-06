package vo.pollution;

import java.util.Map;

public class Pollution_1_calculator {
    private double a;
    private double q;
    private String year;
    private String position;
    private double result;

    public Pollution_1_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        q=Double.parseDouble(jsonMap.get("Q").toString());
    }

    public Pollution_1_calculator(float a, float q, String year, String position, float result) {
        this.a = a;
        this.q = q;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public double calc(){
        result =a*q;
        return result;
    }

    public void setYear(String year){
        this.year=year;
    }
}
