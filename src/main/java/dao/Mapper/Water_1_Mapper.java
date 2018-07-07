package dao.Mapper;

import vo.Water_1_calculator;

public interface Water_1_Mapper {
    Water_1_calculator select(String year);

    int insert(Water_1_calculator water_1_calculator);
}
