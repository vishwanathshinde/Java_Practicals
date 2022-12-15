import java.sql.*;
class jdbc2
{
     public static void main(String args[])
     {
          Connection conn;
          Statement stmt;
          ResultSet rs;
          try
          {
               Class.forName("org.postgresql.Driver");
               conn=DriverManager.getConnection("jdbc2:postgresql://192.168.5.200/bcaty35","bcaty35","");
               if(conn==null)
                    System.out.println("fail");
               else
                    System.out.println("Connected");
               stmt = conn.createStatement();
               rs = stmt.executeQuery("Select * from Person");
               while(rs.next())
               {
                    System.out.println("PID = "+rs.getInt(1));
                    System.out.println("Name = "+rs.getString(2));
                    System.out.println("Gender = "+rs.getString(3));
                    System.out.println("Birth_Year = "+rs.getInt(4));
               }
          }
          catch(Exception e)
          {
               System.out.println(e);
          }
     }
}
