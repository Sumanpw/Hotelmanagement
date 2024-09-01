package hotel.system;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    
    Conn(){
        String url="jdbc:mysql://localhost:3306/Hotelmanagementsystem";
        String username="root";
        String password="Suman@2003";
       try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    c=DriverManager.getConnection(url,username,password);
    s=c.createStatement();
}   catch (Exception e) {
    e.printStackTrace();
}

    }
    
}