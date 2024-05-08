package ex14;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample {
    public void execute(Connection con, String name) throws SQLException {
        Statement stmt = con.createStatement();
        String sql = "SELECT * FROM TABLE WHERE NAME =" + stmt.enquoteIdentifier(name, true);
        stmt.execute(sql);
    }      
}

// "SELECT * FROM TABLE WHERE NAME =" + name;
// "SELECT * FROM TABLE WHERE NAME =" + stmt.enquoteIdentifier(name, true);