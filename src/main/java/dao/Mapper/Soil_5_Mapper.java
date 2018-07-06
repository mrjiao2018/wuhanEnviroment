package dao.Mapper;

import vo.soil.Soil_5_calculator;

public interface Soil_5_Mapper {
    Soil_5_calculator select(String year);

    void insert(Soil_5_calculator soil_5_calculator);
}
