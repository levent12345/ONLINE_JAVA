package JDBC;

import java.sql.*;

public class ResultSett {


        public static void main(String[] args) throws SQLException {


            //"jdbc:postgresql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;

            Connection con= DriverManager.getConnection ("jdbc:oracle:thin:@database-2.cncvwnhabxod.us-east-2.rds.amazonaws.com:1521/ORCL","admin","admin123");

            Statement stm=con.createStatement ();

            String s="select * from student";

           ResultSet rs= stm.executeQuery (s);

           while(rs.next ()){

            int id=rs.getInt ("sno");
            String name=rs.getString ("sname");
            int mark=rs.getInt ("marks");

               System.out.println ("ID : "+id+" Name : "+name+" MARKS : "+mark);

           }










    }
}
