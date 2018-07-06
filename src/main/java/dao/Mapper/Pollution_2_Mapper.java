package dao.Mapper;

import vo.pollution.Pollution_2_calculator;

public interface Pollution_2_Mapper {
    Pollution_2_calculator select(String year);

    void insert(Pollution_2_calculator pollution_2_calculator);
}
