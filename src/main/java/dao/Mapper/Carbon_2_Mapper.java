package dao.Mapper;

import vo.carbon.Carbon_2_calculator;

public interface Carbon_2_Mapper {
    Carbon_2_calculator select(String year);

    void insert(Carbon_2_calculator carbon_2_calculator);
}
