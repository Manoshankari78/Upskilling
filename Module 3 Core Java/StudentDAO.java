import java.sql.*;
public class StudentDAO{
    private static final String URL="jdbc:mysql://localhost:3306/studentsdb";
    private static final String USER="root";
    private static final String PASSWORD="password";
    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
    public boolean insertStudent(Student student){
        String query="INSERT INTO students (id, name, age, major) VALUES (?, ?, ?, ?)";
        try(Connection con=getConnection();
            PreparedStatement pstmt=con.prepareStatement(query)){
                pstmt.setInt(1, student.getId());
                pstmt.setString(2, student.getName());
                pstmt.setInt(3, student.getAge());
                pstmt.setString(4, student.getMajor());
                int rowsAffected=pstmt.executeUpdate();
                return rowsAffected>0;
        }catch(SQLException e){
            System.out.println("Failed to insert student");
            e.printStackTrace();
            return false;
        }
    }
    public boolean updateStudent(Student student){
        String query="UPDATE students SET name=?, age=?, major=? WHERE id=?";
        try(Connection con=getConnection();
            PreparedStatement pstmt=con.prepareStatement(query)){
                pstmt.setString(1, student.getName());
                pstmt.setInt(2, student.getAge());
                pstmt.setString(3, student.getMajor());
                pstmt.setInt(4, student.getId());
                int rowsAffected=pstmt.executeUpdate();
                return rowsAffected>0;
        }catch(SQLException e){
            System.out.println("Failed to update student");
            e.printStackTrace();
            return false;
        }
    }
}
