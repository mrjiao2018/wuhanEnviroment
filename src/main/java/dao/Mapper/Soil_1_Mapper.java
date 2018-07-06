package dao.Mapper;

import vo.soil.Soil_1_calculator;

public interface Soil_1_Mapper {
    Soil_1_calculator select(String year);

    void insert(Soil_1_calculator soil_1_calculator);
}
