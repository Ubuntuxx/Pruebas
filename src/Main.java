import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:/tmp/java/untitled/testjava.db");
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Algo fue mal!: " + e.getMessage());
        }
    }
}