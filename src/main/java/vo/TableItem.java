package vo;

import org.apache.ibatis.session.SqlSession;

public interface TableItem  {
    public String calc();

    public void store(SqlSession sqlSession);

    public void setYear(String year);
}
