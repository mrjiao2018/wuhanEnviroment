package dao.Mapper;

import vo.soil.Soil_3_calculator;

public interface Soil_3_Mapper {
    Soil_3_calculator select(String year);
    void insert(Soil_3_calculator soil_3_calculator);
}
