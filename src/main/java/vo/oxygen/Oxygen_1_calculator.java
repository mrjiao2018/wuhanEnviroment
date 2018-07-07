package vo.oxygen;

import vo.TableItem;

import java.util.Map;

public class Oxygen_1_calculator implements TableItem {
    private double a;
    private double b;
    private String year;
    private String position;
    private double result;

    public Oxygen_1_calculator(Map jsonMap){
        a=Double.parseDouble(jsonMap.get("A").toString());
        b=Double.parseDouble(jsonMap.get("B").toString());
    }

    public Oxygen_1_calculator(float a, float b, String year, String position, float result) {
        this.a = a;
        this.b = b;
        this.year = year;
        this.position = position;
        this.result = result;
    }

    public double calc(){
        result =1.19*a*b;
        return result;
    }

    @Override
    public void store() {

    }

    public void setYear(String year){
        this.year=year;
    }
}
