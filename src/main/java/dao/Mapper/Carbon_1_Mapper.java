package dao.Mapper;

import vo.Carbon_1_calculator;

public interface Carbon_1_Mapper {
    Carbon_1_calculator select(String year);

    void insert(Carbon_1_calculator carbon_1_calculator);
}
