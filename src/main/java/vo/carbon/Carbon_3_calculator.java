package vo.carbon;

import vo.TableItem;

import java.util.Map;

public class Carbon_3_calculator implements TableItem {
    private double a;
    private double f;
    private double c;
    private double r;
    private double b;
    private String year;
    private String position;
    private double result;

    public Carbon_3_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        f=Double.parseDouble(jsonMap.get("F").toString());
        c=Double.parseDouble(jsonMap.get("C").toString());
        r=Double.parseDouble(jsonMap.get("R").toString());
        b=Double.parseDouble(jsonMap.get("B").toString());
    }

    public Carbon_3_calculator(float a, float f, float c, float r, float b, String year, String position, float result) {
        this.a = a;
        this.f = f;
        this.c = c;
        this.r = r;
        this.b = b;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public double calc(){
        result =a*c*(1.63*r*b+f);
        return result;
    }

    @Override
    public void store() {

    }

    public void setYear(String year){
        this.year=year;
    }
}
