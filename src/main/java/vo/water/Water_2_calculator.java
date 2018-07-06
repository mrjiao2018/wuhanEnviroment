package vo.water;

import java.util.Map;

public class Water_2_calculator {
    private double a;
    private double p;
    private double e;
    private double c;
    private double cKu;
    private String year;
    private String position;
    private double result;

    public Water_2_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        p=Double.parseDouble(jsonMap.get("P").toString());
        e=Double.parseDouble(jsonMap.get("E").toString());
        c=Double.parseDouble(jsonMap.get("C").toString());
        cKu=Double.parseDouble(jsonMap.get("Cku").toString());
    }

    public Water_2_calculator(float a, float p, float e, float c, float cKu, String year, String position, float result) {
        this.a = a;
        this.p = p;
        this.e = e;
        this.c = c;
        this.cKu = cKu;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public double calc(){
        result =10*cKu*a*(p-e-c);
        return result;
    }

    public void setYear(String year){
        this.year=year;
    }
}
