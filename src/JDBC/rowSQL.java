package JDBC;

import java.sql.*;

public class rowSQL {
    public static void main(String[] args) throws SQLException {


        //"jdbc:postgresql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;

        Connection con= DriverManager.getConnection ("jdbc:oracle:thin:@database-2.cncvwnhabxod.us-east-2.rds.amazonaws.com:1521/ORCL","admin","admin123");

        Statement stm=con.createStatement ();

        String s="select first_name,last_name  from employees order by first_name";

        ResultSet rs= stm.executeQuery (s);
        int count=0;
       while(rs.next ()){

           System.out.println (rs.getString ("first_name")+"  "+rs.getString ("last_name"));
             count++;

       }

        System.out.println (count);
}}
