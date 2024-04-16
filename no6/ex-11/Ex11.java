import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex11 {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(
            /*insert code here  */ )) {

                var sql = "SELECT * from item";
                try(PreparedStatement ps = con.prepareStatement(sql)){
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()) {
                        System.out.print(rs.getInt(1) + ":");
                        System.out.println(rs.getString("name"));
                    }
                }

            }catch (SQLException e) {
                throw new RuntimeException(e);
            }

    }
}
