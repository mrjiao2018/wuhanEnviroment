package vo.nutriment;

import vo.TableItem;

import java.util.Map;

public class Nutriment_3_calculator implements TableItem {
    private double a;
    private double b;
    private double k;
    private String year;
    private String position;
    private double result;

    public Nutriment_3_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        b=Double.parseDouble(jsonMap.get("B").toString());
        k=Double.parseDouble(jsonMap.get("K").toString());
    }

    public Nutriment_3_calculator(float a, float b, float k, String year, String position, float result) {
        this.a = a;
        this.b = b;
        this.k = k;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public double calc(){
        result =a*k*b;
        return result;
    }

    @Override
    public void store() {

    }

    public void setYear(String year){
        this.year=year;
    }
}
