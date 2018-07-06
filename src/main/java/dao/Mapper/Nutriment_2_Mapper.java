package dao.Mapper;

import vo.nutriment.Nutriment_2_calculator;

public interface Nutriment_2_Mapper {
    Nutriment_2_calculator select(String year);

    void insert(Nutriment_2_calculator nutriment_2_calculator);
}
