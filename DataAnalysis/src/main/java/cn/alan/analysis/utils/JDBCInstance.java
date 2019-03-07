package cn.alan.analysis.utils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 单例模式
 */
public class JDBCInstance {
    private static Connection connection = null;
    private JDBCInstance(){}
    public static Connection getInstance(){
        try {
            if(connection == null || connection.isClosed() || !connection.isValid(3)){
                connection = JDBCUtil.getConnection();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
