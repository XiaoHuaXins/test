package Dao;


import entity.Lonin;

import java.sql.*;


public class LoninDao {

    private final String URL = "jdbc:mysql://localhost:3306/test";
    private final String NAME = "root";
    private final String PWD = "123456";
    private PreparedStatement stmt = null;
    private Connection connection = null;
    private ResultSet rs = null;
    private int res = -1;
    private int changeLines = 0;

    public boolean  login(Lonin lonin){

        //加载具体驱动类

        try{
            Class.forName("com.mysql.jdbc.Driver");
            //建立具体连接
            connection = DriverManager.getConnection(URL,NAME,PWD);
            //发送sql，执行
            String sql = "select count(*) from id where id =? and pwd =?";
            stmt = connection.prepareStatement(sql);
            stmt.setString(1,lonin.getId());
            stmt.setString(2,lonin.getPwd());
            rs = stmt.executeQuery();//返回值表示增删改 几条数据
            if(rs.next()){
             res = rs.getInt(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                stmt.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    if(res>0)
    {
        return true;
    }
    else return false;
    }
    public boolean insert(Lonin lonin){
        //加载具体驱动类
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //建立具体连接
            connection = DriverManager.getConnection(URL,NAME,PWD);
            //发送sql，执行
            String sql = "insert into id values(?,?,?)";
            stmt = connection.prepareStatement(sql);
            stmt.setString(1,lonin.getName());
            stmt.setString(2,lonin.getId());
            stmt.setString(3,lonin.getPwd());
            changeLines = stmt.executeUpdate();//返回值表示增删改 几条数据
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                stmt.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(changeLines>0)
        {
            return true;
        }
        else return false;
    }
    public boolean query(Lonin lonin) throws SQLException {
        //加载具体驱动类
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //建立具体连接
            connection = DriverManager.getConnection(URL,NAME,PWD);
            //发送sql，执行
            String sql = "select * from id where id=?";
            stmt = connection.prepareStatement(sql);
            stmt.setString(1,lonin.getId());
            rs = stmt.executeQuery();//返回值表示增删改 几条数据
            if(rs.next()){
                res = rs.getInt(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while(rs.next())
        {
           if( lonin.getId().equals(rs.getString(2))){
               return false;
           }
        }

    }

}
