import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample3 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(null, null, null);

            System.out.println(con);
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException();
        }

    }
}