package dao.Mapper;

import vo.water.Water_3_calculator;

public interface Water_3_Mapper {
    Water_3_calculator select(String year);

    void insert(Water_3_calculator water_3_calculator);
}
