package com.LIMS.util;



import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.LIMS.Model.User;

/**
 * 这是数据库连接类
 *
 *
 */
public class JDBCUtil {

    //private final static String DRIVER = "oracle.jdbc.OracleDriver";
    //private final static String URL ="jdbc:oracle:thin:@192.168.100.248:1522:qst";
    //private final static String USERNAME = "rhb";
    //private final static String PASSWORD = "a123";

    private final static String DRIVER = "com.mysql.jdbc.Driver";
    private final static String URL = "jdbc:mysql://localhost:3306/lims?useUnicode=true&characterEncoding=utf8";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "";

//	private static String DRIVER;
//	private static String URL;
//	private static String USERNAME;
//	private static String PASSWORD;
//	static{
//		Properties pro = new Properties();
//		InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("db.properties");
//		try {
//			pro.load(is);
//			DRIVER = pro.getProperty("DRIVER");
//			URL = pro.getProperty("URL");
//			USERNAME = pro.getProperty("USERNAME");
//			PASSWORD = pro.getProperty("PASSWORD");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

    /**
     * 这是数据库连接的方法
     *
     * @return
     */
    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }

    /**
     * 这是关闭数据库连接的方法
     *
     * @param con
     * @param pstmt
     * @param stmt
     * @param rs
     */
    public void close(Connection con, PreparedStatement pstmt, Statement stmt, ResultSet rs) {
        try {
            if (con != null) {
                con.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
    }



}

