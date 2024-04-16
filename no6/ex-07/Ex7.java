import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex7 {
    public static void  main(String[] args) {
        try (Connection con = DriverManager.getConnection(
            /* insert code here*/)) {
            var sql = "insert into Item values(?, ?)";
            try(PreparedStatement ps = con.prepareStatement(sql)){
                ps.setInt(1, 0);
                ps.setString(2, "Sample");
            }   

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

    } 
}
