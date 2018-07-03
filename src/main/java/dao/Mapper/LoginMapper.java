package dao.Mapper;

import org.apache.ibatis.annotations.Param;
import vo.User;

public interface LoginMapper {
    User selectUser(@Param("username") String username,@Param("password") String password);
}
