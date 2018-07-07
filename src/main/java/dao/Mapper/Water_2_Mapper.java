package dao.Mapper;

import vo.Water_2_calculator;

public interface Water_2_Mapper {
    Water_2_calculator select(String year);

    void insert(Water_2_calculator water_2_calculator);
}
