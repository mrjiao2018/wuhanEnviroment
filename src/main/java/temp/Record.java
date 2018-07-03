package temp;

import vo.carbon.*;
import vo.lon.*;
import vo.nutriment.*;
import vo.oxygen.*;
import vo.pollution.*;
import vo.soil.*;
import vo.water.*;

public class Record {
    private String username;
    private String year;
    private String position;

    private Water_1_formula water_1_formula;
    private Water_2_formula water_2_formula;
    private Water_3_formula water_3_formula;

    private Carbon_1_calculator carbon_1_calculator;
    private Carbon_2_calculator carbon_2_calculator;
    private Carbon_3_calculator carbon_3_calculator;

    private Ion_1_calculator ion_1_calculator;

    private Nutriment_1_calculator nutriment_1_calculator;
    private Nutriment_2_calculator nutriment_2_calculator;
    private Nutriment_3_calculator nutriment_3_calculator;
    private Nutriment_4_calculator nutriment_4_calculator;

    private Oxygen_1_calculator oxygen_1_calculator;
    private Oxygen_2_calculator oxygen_2_calculator;

    private Pollution_1_calculator pollution_1_calculator;
    private Pollution_2_calculator pollution_2_calculator;
    private Pollution_3_calculator pollution_3_calculator;
    private Pollution_4_calculator pollution_4_calculator;
    private Pollution_5_calculator pollution_5_calculator;

    private Soil_1_calculator soil_1_calculator;
    private Soil_2_calculator soil_2_calculator;
    private Soil_3_calculator soil_3_calculator;
    private Soil_4_calculator soil_4_calculator;
    private Soil_5_calculator soil_5_calculator;
    private Soil_6_calculator soil_6_calculator;


    public String getUsername() {
        return username;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Water_1_formula getWater_1_formula() {
        return water_1_formula;
    }

    public void setWater_1_formula(Water_1_formula water_1_formula) {
        this.water_1_formula = water_1_formula;
    }

    public Water_2_formula getWater_2_formula() {
        return water_2_formula;
    }

    public void setWater_2_formula(Water_2_formula water_2_formula) {
        this.water_2_formula = water_2_formula;
    }

    public Water_3_formula getWater_3_formula() {
        return water_3_formula;
    }

    public void setWater_3_formula(Water_3_formula water_3_formula) {
        this.water_3_formula = water_3_formula;
    }

    public Carbon_1_calculator getCarbon_1_calculator() {
        return carbon_1_calculator;
    }

    public void setCarbon_1_calculator(Carbon_1_calculator carbon_1_calculator) {
        this.carbon_1_calculator = carbon_1_calculator;
    }

    public Carbon_2_calculator getCarbon_2_calculator() {
        return carbon_2_calculator;
    }

    public void setCarbon_2_calculator(Carbon_2_calculator carbon_2_calculator) {
        this.carbon_2_calculator = carbon_2_calculator;
    }

    public Carbon_3_calculator getCarbon_3_calculator() {
        return carbon_3_calculator;
    }

    public void setCarbon_3_calculator(Carbon_3_calculator carbon_3_calculator) {
        this.carbon_3_calculator = carbon_3_calculator;
    }

    public Ion_1_calculator getIon_1_calculator() {
        return ion_1_calculator;
    }

    public void setIon_1_calculator(Ion_1_calculator ion_1_calculator) {
        this.ion_1_calculator = ion_1_calculator;
    }

    public Nutriment_1_calculator getNutriment_1_calculator() {
        return nutriment_1_calculator;
    }

    public void setNutriment_1_calculator(Nutriment_1_calculator nutriment_1_calculator) {
        this.nutriment_1_calculator = nutriment_1_calculator;
    }

    public Nutriment_2_calculator getNutriment_2_calculator() {
        return nutriment_2_calculator;
    }

    public void setNutriment_2_calculator(Nutriment_2_calculator nutriment_2_calculator) {
        this.nutriment_2_calculator = nutriment_2_calculator;
    }

    public Nutriment_3_calculator getNutriment_3_calculator() {
        return nutriment_3_calculator;
    }

    public void setNutriment_3_calculator(Nutriment_3_calculator nutriment_3_calculator) {
        this.nutriment_3_calculator = nutriment_3_calculator;
    }

    public Nutriment_4_calculator getNutriment_4_calculator() {
        return nutriment_4_calculator;
    }

    public void setNutriment_4_calculator(Nutriment_4_calculator nutriment_4_calculator) {
        this.nutriment_4_calculator = nutriment_4_calculator;
    }

    public Oxygen_1_calculator getOxygen_1_calculator() {
        return oxygen_1_calculator;
    }

    public void setOxygen_1_calculator(Oxygen_1_calculator oxygen_1_calculator) {
        this.oxygen_1_calculator = oxygen_1_calculator;
    }

    public Oxygen_2_calculator getOxygen_2_calculator() {
        return oxygen_2_calculator;
    }

    public void setOxygen_2_calculator(Oxygen_2_calculator oxygen_2_calculator) {
        this.oxygen_2_calculator = oxygen_2_calculator;
    }

    public Pollution_1_calculator getPollution_1_calculator() {
        return pollution_1_calculator;
    }

    public void setPollution_1_calculator(Pollution_1_calculator pollution_1_calculator) {
        this.pollution_1_calculator = pollution_1_calculator;
    }

    public Pollution_2_calculator getPollution_2_calculator() {
        return pollution_2_calculator;
    }

    public void setPollution_2_calculator(Pollution_2_calculator pollution_2_calculator) {
        this.pollution_2_calculator = pollution_2_calculator;
    }

    public Pollution_3_calculator getPollution_3_calculator() {
        return pollution_3_calculator;
    }

    public void setPollution_3_calculator(Pollution_3_calculator pollution_3_calculator) {
        this.pollution_3_calculator = pollution_3_calculator;
    }

    public Pollution_4_calculator getPollution_4_calculator() {
        return pollution_4_calculator;
    }

    public void setPollution_4_calculator(Pollution_4_calculator pollution_4_calculator) {
        this.pollution_4_calculator = pollution_4_calculator;
    }

    public Pollution_5_calculator getPollution_5_calculator() {
        return pollution_5_calculator;
    }

    public void setPollution_5_calculator(Pollution_5_calculator pollution_5_calculator) {
        this.pollution_5_calculator = pollution_5_calculator;
    }

    public Soil_1_calculator getSoil_1_calculator() {
        return soil_1_calculator;
    }

    public void setSoil_1_calculator(Soil_1_calculator soil_1_calculator) {
        this.soil_1_calculator = soil_1_calculator;
    }

    public Soil_2_calculator getSoil_2_calculator() {
        return soil_2_calculator;
    }

    public void setSoil_2_calculator(Soil_2_calculator soil_2_calculator) {
        this.soil_2_calculator = soil_2_calculator;
    }

    public Soil_3_calculator getSoil_3_calculator() {
        return soil_3_calculator;
    }

    public void setSoil_3_calculator(Soil_3_calculator soil_3_calculator) {
        this.soil_3_calculator = soil_3_calculator;
    }

    public Soil_4_calculator getSoil_4_calculator() {
        return soil_4_calculator;
    }

    public void setSoil_4_calculator(Soil_4_calculator soil_4_calculator) {
        this.soil_4_calculator = soil_4_calculator;
    }

    public Soil_5_calculator getSoil_5_calculator() {
        return soil_5_calculator;
    }

    public void setSoil_5_calculator(Soil_5_calculator soil_5_calculator) {
        this.soil_5_calculator = soil_5_calculator;
    }

    public Soil_6_calculator getSoil_6_calculator() {
        return soil_6_calculator;
    }

    public void setSoil_6_calculator(Soil_6_calculator soil_6_calculator) {
        this.soil_6_calculator = soil_6_calculator;
    }
}
