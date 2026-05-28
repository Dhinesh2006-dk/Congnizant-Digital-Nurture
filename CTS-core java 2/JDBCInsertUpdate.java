import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
class StudentDAO {
    Connection con;
    StudentDAO() {
        try {
          Class.forName(
            "com.mysql.cj.jdbc.Driver");
            con =
            DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college",
            "root",
            "Dhinesh@18");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public void insertStudent(
    int id, String name) {
        try {
            String query =
            "INSERT INTO students VALUES(?, ?)";
            PreparedStatement ps =
            con.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, name);
            int rows = ps.executeUpdate();
            System.out.println(
            rows + " Record Inserted");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public void updateStudent(
    int id, String newName) {
        try {
            String query =
            "UPDATE students SET name=? WHERE id=?";
            PreparedStatement ps =
            con.prepareStatement(query);
            ps.setString(1, newName);
            ps.setInt(2, id);
            int rows = ps.executeUpdate();
            System.out.println(
            rows + " Record Updated");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
public class JDBCInsertUpdate {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        dao.insertStudent(103, "Hermione");
        dao.updateStudent(101, "Ron Weasley");
    }
}