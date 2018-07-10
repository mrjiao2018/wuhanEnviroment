package dao.Mapper;

import vo.Nutriment_4_calculator;

public interface Nutriment_4_Mapper {
    Nutriment_4_calculator select(String year);

    void insert(Nutriment_4_calculator nutriment_4_calculator);
}
