package dao.Mapper;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface RecordMapper {
    void insert(@Param("tableName") String tableName,@Param("map") Map map);
}
