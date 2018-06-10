package dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
    public static Connection getCon(){
            try {
                String url="jdbc:mysql://193.112.33.53:3306/whenvirment?useUnicode=true&characterEncoding=utf8&&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection=DriverManager.getConnection(url,"lzb","lzb");
                return connection;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
    }
}
