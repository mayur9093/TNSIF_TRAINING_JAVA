package org.tnsif.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.Console;

public class PostgresConnectionDemo {
    public static void main(String[] args) {
        String host = environmentValue("PGHOST", "localhost");
        String port = environmentValue("PGPORT", "5432");
        String database = environmentValue("PGDATABASE", "postgres");
        String user = environmentValue("PGUSER", "postgres");
        String password = System.getenv("PGPASSWORD");

        if (password == null) {
            Console console = System.console();
            if (console == null) {
                System.err.println("Set PGPASSWORD before running this program.");
                return;
            }
            char[] passwordChars = console.readPassword("PostgreSQL password: ");
            password = new String(passwordChars);
        }

        String url = "jdbc:postgresql://" + host + ":" + port + "/" + database;

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT version()")) {
            if (resultSet.next()) {
                System.out.println("Connected to PostgreSQL.");
                System.out.println(resultSet.getString(1));
            }
        } catch (SQLException exception) {
            System.err.println("PostgreSQL connection failed: " + exception.getMessage());
        }
    }

    private static String environmentValue(String name, String defaultValue) {
        String value = System.getenv(name);
        return value == null || value.isBlank() ? defaultValue : value;
    }
}
