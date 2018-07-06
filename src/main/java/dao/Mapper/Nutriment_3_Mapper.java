package dao.Mapper;

import vo.nutriment.Nutriment_3_calculator;

public interface Nutriment_3_Mapper {
    Nutriment_3_calculator select(String year);

    void insert(Nutriment_3_calculator nutriment_3_calculator);
}
