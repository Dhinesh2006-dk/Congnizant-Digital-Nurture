import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class TransactionExample {
    public static void main(String[] args) {
        try {
            Class.forName(
            "com.mysql.cj.jdbc.Driver");
            Connection con =
            DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/bank",
            "root",
            "Dhinesh@18");
            con.setAutoCommit(false);
            String debitQuery =
            "UPDATE accounts SET balance = balance - ? WHERE id = ?";
            PreparedStatement debitStmt =
            con.prepareStatement(debitQuery);
            debitStmt.setDouble(1, 1000);
            debitStmt.setInt(2, 1);
            debitStmt.executeUpdate();
            String creditQuery =
            "UPDATE accounts SET balance = balance + ? WHERE id = ?";
            PreparedStatement creditStmt =
            con.prepareStatement(creditQuery);
            creditStmt.setDouble(1, 1000);
            creditStmt.setInt(2, 2);
            creditStmt.executeUpdate();
            con.commit();
            System.out.println(
            "Transaction Successful!");
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println(
            "Transaction Failed!");
        }
    }
}