package dao.Mapper;

import vo.nutriment.Nutriment_1_calculator;

public interface Nutriment_1_Mapper {
    Nutriment_1_calculator select(String year);

    void insert(Nutriment_1_calculator nutriment_1_calculator);
}
