package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CDBC_1 {
    public static void main(String[] args) throws SQLException {


        //"jdbc:postgresql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;

    Connection con= DriverManager.getConnection ("jdbc:oracle:thin:@database-2.cncvwnhabxod.us-east-2.rds.amazonaws.com:1521/ORCL","admin","admin123");

    Statement stm=con.createStatement ();

    String s="insert into student values(104,'Veli',65)";

   // stm.execute (s);



       // System.out.println ("Query Excecuted");
String s2="delete from  student where sno=104";

stm.execute (s2);
        System.out.println ("Row Deleted");


    }
}
