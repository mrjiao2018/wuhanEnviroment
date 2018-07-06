package dao.Mapper;

import vo.oxygen.Oxygen_2_calculator;

public interface Oxygen_2_Mapper {
    Oxygen_2_calculator select(String year);

    void insert(Oxygen_2_calculator oxygen_2_calculator);
}
