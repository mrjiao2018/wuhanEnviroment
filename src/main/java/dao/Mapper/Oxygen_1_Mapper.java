package dao.Mapper;

import vo.Oxygen_1_calculator;

public interface Oxygen_1_Mapper {
    Oxygen_1_calculator select(String year);

    void insert(Oxygen_1_calculator oxygen_1_calculator);
}
