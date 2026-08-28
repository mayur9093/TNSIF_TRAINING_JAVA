package org.tnsif.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresTableCreation {
   public static void main(String[] args) {
      String host = environmentValue("PGHOST", "localhost");
      String port = environmentValue("PGPORT", "5432");
      String database = environmentValue("PGDATABASE", "postgres");
      String user = environmentValue("PGUSER", "postgres");
      String password = System.getenv("PGPASSWORD");

      if (password == null || password.isBlank()) {
         System.err.println("Set PGPASSWORD before running this program.");
         return;
      }

      String url = "jdbc:postgresql://" + host + ":" + port + "/" + database;

      try (Connection c = DriverManager.getConnection(url, user, password);
            Statement stmt = c.createStatement()) {
         System.out.println("Opened database successfully");

         String sql = "CREATE TABLE IF NOT EXISTS COMPANY " +
               "(ID INT PRIMARY KEY     NOT NULL," +
               " NAME           TEXT    NOT NULL, " +
               " AGE            INT     NOT NULL, " +
               " ADDRESS        CHAR(50), " +
               " SALARY         REAL)";
         stmt.executeUpdate(sql);
      } catch (SQLException e) {
         System.err.println("PostgreSQL table creation failed: " + e.getMessage());
         System.exit(1);
      }
      System.out.println("Table created successfully");
   }

   private static String environmentValue(String name, String defaultValue) {
      String value = System.getenv(name);
      return value == null || value.isBlank() ? defaultValue : value;
   }
}
