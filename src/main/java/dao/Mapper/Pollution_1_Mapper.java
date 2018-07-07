package dao.Mapper;

import vo.Pollution_1_calculator;

public interface Pollution_1_Mapper {
    Pollution_1_calculator select(String year);

    void insert(Pollution_1_calculator pollution_1_calculator);
}
