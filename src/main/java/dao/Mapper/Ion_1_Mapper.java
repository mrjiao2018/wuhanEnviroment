package dao.Mapper;

import vo.Ion_1_calculator;

public interface Ion_1_Mapper {
    Ion_1_calculator select(String year);

    void insert(Ion_1_calculator ion_1_calculator);
}
