package TidyConnection;

import java.sql.*;

class DBConnection {


    void launch() {

        String sqlCommand = "select * from quescom";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sqlCommand)) {

            while (rs.next()) {

                System.out.println(rs.getString(1) + " " + rs.getString(2));

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    private Connection connect() {

        String url = "jdbc:sqlite:C://sqlite/cdrStore.db";
        Connection conn = null;

        try {

            conn = DriverManager.getConnection(url);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

}
