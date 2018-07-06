package dao.Mapper;

import vo.pollution.Pollution_5_calculator;

public interface Pollution_5_Mapper {
    Pollution_5_calculator select(String year);

    void insert(Pollution_5_calculator pollution_5_calculator);
}
