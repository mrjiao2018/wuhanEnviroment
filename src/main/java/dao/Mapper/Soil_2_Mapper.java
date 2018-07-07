package dao.Mapper;

import vo.Soil_2_calculator;

public interface Soil_2_Mapper {
    Soil_2_calculator select(String year);

    void insert(Soil_2_calculator soil_2_calculator);
}
