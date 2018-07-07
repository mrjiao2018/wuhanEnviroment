package vo.nutriment;

import vo.TableItem;

import java.util.Map;

public class Nutriment_1_calculator implements TableItem {
    private double a;
    private double b;
    private double n;
    private String year;
    private String position;
    private double result;

    public Nutriment_1_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        b=Double.parseDouble(jsonMap.get("B").toString());
        n=Double.parseDouble(jsonMap.get("N").toString());
    }

    public Nutriment_1_calculator(float a, float b, float n, String year, String position, float result) {
        this.a = a;
        this.b = b;
        this.n = n;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public double calc(){
        result =a*n*b;
        return result;
    }

    @Override
    public void store() {

    }

    public void setYear(String year){
        this.year=year;
    }
}
