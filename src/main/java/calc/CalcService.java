package calc;

import java.util.Map;


public class CalcService {

    public double water_1_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double p=Double.parseDouble(jsonMap.get("P").toString());
        double e=Double.parseDouble(jsonMap.get("E").toString());
        double c=Double.parseDouble(jsonMap.get("C").toString());
        return 10*a*(p-e-c);
    }

    public double water_2_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double p=Double.parseDouble(jsonMap.get("P").toString());
        double e=Double.parseDouble(jsonMap.get("E").toString());
        double c=Double.parseDouble(jsonMap.get("C").toString());
        double cKu=Double.parseDouble(jsonMap.get("Cku").toString());
        return 10*cKu*a*(p-e-c);
    }

    public double water_3_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double p=Double.parseDouble(jsonMap.get("P").toString());
        double e=Double.parseDouble(jsonMap.get("E").toString());
        double c=Double.parseDouble(jsonMap.get("C").toString());
        double k=Double.parseDouble(jsonMap.get("K").toString());
        return 10*k*a*(p-e-c);
    }

    public double soil_1_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double x1=Double.parseDouble(jsonMap.get("X1").toString());
        double x2=Double.parseDouble(jsonMap.get("X2").toString());
        return a*(x1-x2);
    }

    public double soil_2_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double x1=Double.parseDouble(jsonMap.get("X1").toString());
        double x2=Double.parseDouble(jsonMap.get("X2").toString());
        double n=Double.parseDouble(jsonMap.get("N").toString());
        return a*n*(x1-x2);
    }

    public double soil_3_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double x1=Double.parseDouble(jsonMap.get("X1").toString());
        double x2=Double.parseDouble(jsonMap.get("X2").toString());
        double p=Double.parseDouble(jsonMap.get("P").toString());
        return a*p*(x1-x2);
    }

    public double soil_4_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double x1=Double.parseDouble(jsonMap.get("X1").toString());
        double x2=Double.parseDouble(jsonMap.get("X2").toString());
        double k=Double.parseDouble(jsonMap.get("K").toString());
        return a*k*(x1-x2);
    }

    public double soil_5_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double x1=Double.parseDouble(jsonMap.get("X1").toString());
        double x2=Double.parseDouble(jsonMap.get("X2").toString());
        double ctu=Double.parseDouble(jsonMap.get("CTu").toString());
        double p=Double.parseDouble(jsonMap.get("p").toString());
        return a*ctu*(x1-x2)/p;
    }

    public double soil_6_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double x1=Double.parseDouble(jsonMap.get("X1").toString());
        double x2=Double.parseDouble(jsonMap.get("X2").toString());
        double c1=Double.parseDouble(jsonMap.get("C1").toString());
        double c2=Double.parseDouble(jsonMap.get("C2").toString());
        double c3=Double.parseDouble(jsonMap.get("C3").toString());
        double r1=Double.parseDouble(jsonMap.get("R1").toString());
        double r2=Double.parseDouble(jsonMap.get("R2").toString());
        double r3=Double.parseDouble(jsonMap.get("R3").toString());
        double n=Double.parseDouble(jsonMap.get("N").toString());
        double p=Double.parseDouble(jsonMap.get("P").toString());
        double k=Double.parseDouble(jsonMap.get("K").toString());
        double m=Double.parseDouble(jsonMap.get("M").toString());
        return a*(x2-x1)*(n*c1/r1+p*c1/r2+k*c2/r3+ m*c3);
    }

    public double carbon_1_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double rc=Double.parseDouble(jsonMap.get("Rc").toString());
        double b=Double.parseDouble(jsonMap.get("B").toString());
        return 1.63*a*b*rc;
    }

    public double carbon_2_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double f=Double.parseDouble(jsonMap.get("F").toString());
        return a*f;
    }

    public double carbon_3_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double f=Double.parseDouble(jsonMap.get("F").toString());
        double c=Double.parseDouble(jsonMap.get("C").toString());
        double r=Double.parseDouble(jsonMap.get("R").toString());
        double b=Double.parseDouble(jsonMap.get("B").toString());
        return a*c*(1.63*r*b+f);
    }

    public double oxygen_1_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double b=Double.parseDouble(jsonMap.get("B").toString());
        return 1.19*a*b;
    }

    public double oxygen_2_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double b=Double.parseDouble(jsonMap.get("B").toString());
        double c=Double.parseDouble(jsonMap.get("C").toString());
        return 1.19*c*a*b;
    }

    public double nutriment_1_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double b=Double.parseDouble(jsonMap.get("B").toString());
        double n=Double.parseDouble(jsonMap.get("N").toString());
        return a*n*b;
    }

    public double nutriment_2_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double b=Double.parseDouble(jsonMap.get("B").toString());
        double p=Double.parseDouble(jsonMap.get("P").toString());
        return a*p*b;
    }

    public double nutriment_3_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double b=Double.parseDouble(jsonMap.get("B").toString());
        double k=Double.parseDouble(jsonMap.get("K").toString());
        return a*k*b;
    }

    public double nutriment_4_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double b=Double.parseDouble(jsonMap.get("B").toString());
        double c1=Double.parseDouble(jsonMap.get("C1").toString());
        double c2=Double.parseDouble(jsonMap.get("C2").toString());
        double r1=Double.parseDouble(jsonMap.get("R1").toString());
        double r2=Double.parseDouble(jsonMap.get("R2").toString());
        double r3=Double.parseDouble(jsonMap.get("R3").toString());
        double n=Double.parseDouble(jsonMap.get("N").toString());
        double p=Double.parseDouble(jsonMap.get("P").toString());
        double k=Double.parseDouble(jsonMap.get("K").toString());
        return a*b*(n*c1/r1+p*c1/r2+k*c2/r3);
    }

    public double ion_1_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double h=Double.parseDouble(jsonMap.get("H").toString());
        double l=Double.parseDouble(jsonMap.get("L").toString());
        double q=Double.parseDouble(jsonMap.get("Q").toString());
        return 5.256E15*q*a*h/l;
    }

    public double pollution_1_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double q=Double.parseDouble(jsonMap.get("Q").toString());
        return a*q;
    }

    public double pollution_2_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double q=Double.parseDouble(jsonMap.get("Q").toString());
        return a*q;
    }

    public double pollution_3_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double q=Double.parseDouble(jsonMap.get("Q").toString());
        return a*q;
    }

    public double pollution_4_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double q=Double.parseDouble(jsonMap.get("Q").toString());
        return a*q;
    }

    public double pollution_5_calculator(Map jsonMap){
        double a=Double.parseDouble(jsonMap.get("A").toString());
        double q=Double.parseDouble(jsonMap.get("Q").toString());
        return a*q;
    }

}
