package dao.Mapper;

import vo.carbon.Carbon_3_calculator;

public interface Carbon_3_Mapper {
    Carbon_3_calculator select(String year);

    void insert(Carbon_3_calculator carbon_3_calculator);
}
