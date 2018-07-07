package dao.Mapper;

import vo.Pollution_3_calculator;

public interface Pollution_3_Mapper {
    Pollution_3_calculator select(String year);

    void insert(Pollution_3_calculator pollution_3_calculator);
}
