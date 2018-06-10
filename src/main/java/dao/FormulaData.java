package dao;

import dbcon.DBCon;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

public class FormulaData {
    public static Connection con;
    static {
        con=DBCon.getCon();
    }

    public static boolean insert(Map map){
        String sql="insert into table values (";
        for (Object value : map.values()) {
            sql+=(double)value+",";
        }
        sql=sql.substring(0,sql.length()-1);
        sql+=")";
        try {
            Statement statement=con.createStatement();
            statement.execute(sql);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void select(String tableName){
        String sql="select * from "+tableName;
        try {
            Statement statement=con.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
