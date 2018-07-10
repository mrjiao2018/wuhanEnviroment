package dao.Mapper;

import vo.Soil_6_calculator;

public interface Soil_6_Mapper {
    Soil_6_calculator select(String year);

    void insert(Soil_6_calculator soil_6_calculator);
}
