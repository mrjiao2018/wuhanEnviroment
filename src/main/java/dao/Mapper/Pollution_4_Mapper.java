package dao.Mapper;

import vo.pollution.Pollution_4_calculator;

public interface Pollution_4_Mapper {
    Pollution_4_calculator select(String year);

    void insert(Pollution_4_calculator pollution_4_calculator);
}
