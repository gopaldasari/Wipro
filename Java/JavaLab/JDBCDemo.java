package JavaLab;
 
import java.sql.*;

 
public class JDBCDemo 
{
    public static void main(String arg[])
    {
        Connection connection = null;
        String URL= "jdbc:mysql://localhost:3306/db";
        String userName="root";
        String password ="Gopal";
        int code;
        String title;

        try {
//          below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL,userName,password);
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
//            statement.executeUpdate("create table designation(code int, title char(30))");
//            statement.executeUpdate("insert into designation values('101','Carol')"); 
//            statement.executeUpdate("insert into designation values('102','Clerk')"); 
            System.out.println("After new record insertion");
            resultSet = statement.executeQuery("select * from designation");
//            int code;
//            String title;
            while (resultSet.next()) 
            {
                code = resultSet.getInt("code");
                title = resultSet.getString("title").trim();
                System.out.println("Employee code : " + code+ " Employee title : " + title);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) 
        {
            System.out.println(exception);
        }
    } // function ends
} // class ends