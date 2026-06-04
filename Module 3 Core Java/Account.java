import java.sql.*;
public class Account{
private static final String URL="jdbc:mysql://localhost:3306/studentsdb";
   private static final String USER="root";
   private static final String PASSWORD="maX@89sql";
   public static void main(String[] args){
    executeTransfer(1, 2, 200.00);
   }
   public static void executeTransfer(int fromAccountId, int toAccountId, double amount){
    String debitSql="UPDATE accounts SET balance = balance - ? WHERE account_id = ?";
    String creditSql="UPDATE accounts SET balance = balance + ? WHERE account_id = ?";
    Connection con=null;
    PreparedStatement debitStmt=null;
    PreparedStatement creditStmt=null;
    try{
        con=DriverManager.getConnection(URL, USER, PASSWORD);
        con.setAutoCommit(false);
        debitStmt=con.prepareStatement(debitSql);
        debitStmt.setDouble(1, amount);
        debitStmt.setInt(2, fromAccountId);
        int debitRows=debitStmt.executeUpdate();
        creditStmt=con.prepareStatement(creditSql);
        creditStmt.setDouble(1, amount);
        creditStmt.setInt(2, toAccountId);
        int creditRows=creditStmt.executeUpdate();
        if(debitRows==1 && creditRows==1){
            con.commit();
            System.out.println("Transfer successful! $" + amount + " transferred from account " + fromAccountId + " to account " + toAccountId);
        }else{
            con.rollback();
            System.out.println("Transfer failed: Account not found or insufficient funds");
        }
    }catch(SQLException e){
        e.printStackTrace();
        System.err.println("Critical Exception occurred during transfer. Rolling back transaction immediately.");
        try {
            if (con != null) {
                con.rollback();
            }
        } catch (SQLException ex) {
            System.err.println("Error occurred while rolling back transaction.");
            ex.printStackTrace();
        }
    }finally{
        try {
            if (debitStmt != null) debitStmt.close();
            if (creditStmt != null) creditStmt.close();
            if (con != null) {
                con.setAutoCommit(true);
                con.close();
            }
        } catch (SQLException e) {
            System.err.println("Error occurred while closing resources.");
            e.printStackTrace();
        }
    }
   }
}