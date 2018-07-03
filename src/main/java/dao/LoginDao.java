package dao;

import dao.Mapper.LoginMapper;
import org.apache.ibatis.session.SqlSession;
import vo.User;

public class LoginDao {
    public User getUser(String username,String password){
        if (username.length()>12){
            username=username.substring(0,11);
        }
        if (password.length()>16){
            password=password.substring(0,15);
        }
        SqlSession session = SessionFactory.getSession();
        LoginMapper loginMapper=session.getMapper(LoginMapper.class);
        return loginMapper.selectUser(username,password);
    }
}
