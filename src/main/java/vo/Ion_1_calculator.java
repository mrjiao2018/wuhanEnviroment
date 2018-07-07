package vo;

import vo.TableItem;

import java.util.Map;

public class Ion_1_calculator implements TableItem {
    private double a;
    private double h;
    private double l;
    private double q;
    private String year;
    private String position;
    private double result;

    public Ion_1_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        h=Double.parseDouble(jsonMap.get("H").toString());
        l=Double.parseDouble(jsonMap.get("L").toString());
        q=Double.parseDouble(jsonMap.get("Q").toString());
    }

    public Ion_1_calculator(float a, float h, float l, float q, String year, String position, float result) {
        this.a = a;
        this.h = h;
        this.l = l;
        this.q = q;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public double calc(){
        result =5.256E15*q*a*h/l;
        return result;
    }

    @Override
    public void store() {

    }

    public void setYear(String year){
        this.year=year;
    }
}
