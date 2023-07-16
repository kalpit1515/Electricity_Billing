package ebs;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "codeforinterview");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
