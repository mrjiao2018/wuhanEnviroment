package dao.Mapper;

import vo.soil.Soil_4_calculator;

public interface Soil_4_Mapper {
    Soil_4_calculator select(String year);

    void insert(Soil_4_calculator soil_4_calculator);
}
