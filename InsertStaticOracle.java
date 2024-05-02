import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class InsertStaticOracle {
    public static void main(String args[]) {
        Statement st = null;
        Connection connection = null;

        try {
            // Load the Oracle JDBC driver
            Class.forName("oracle.jdbc.OracleDriver");

            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String username = "System";
            String password = "pass";

            // Establish the connection
            connection = DriverManager.getConnection(url, username, password);

            if (connection != null)
                System.out.println("Connection established successfully");

            st = connection.createStatement();

            // SQL query to insert data into the Student table
            String qry = "INSERT INTO Student VALUES (104, 'Atharva Agrawal', 'Dhule')";

            // Execute the query
            int count = st.executeUpdate(qry);

            System.out.println(count + " row(s) inserted successfully");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close resources in the finally block
                if (st != null)
                    st.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
