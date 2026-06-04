import java.sql.*;
public class JdbcConnection{
    private static final String URL="jdbc:mysql://localhost:3306/studentsdb";
    private static final String USER="root";
    private static final String PASSWORD="password";
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(ClassNotFoundException e){
            System.out.println("MySQL JDBC Driver not found");
            e.printStackTrace();
        }
        String query="Select *from students";
        try(Connection con=DriverManager.getConnection(URL,USER,PASSWORD);
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query)){
                System.out.println("Connected to the database successfully");
                System.out.printf("%5s | %-20s | %3s | %-20s%n", "ID", "Name", "Age", "Major");
                while(rs.next()){
                    int id=rs.getInt("id");
                    String name=rs.getString("name");
                    int age=rs.getInt("age");
                    String major=rs.getString("major");
                    System.out.printf("%5d | %-20s | %3d | %-20s%n", id, name, age, major);
                }
        }catch(SQLException e){
            System.out.println("Database operation failed");
            e.printStackTrace();
        }
    }
}
