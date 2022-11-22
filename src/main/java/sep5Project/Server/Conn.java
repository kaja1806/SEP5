package sep5Project.Server;

import java.sql.Connection;
import java.sql.DriveManager;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conn {
    private String url = "localhost";
    private String databaseName = "postgres?currentSchema=sep5";
    private String username = "postgres";
    private int port = 5432;
    private String password = "kaja1806";
    private Connection connection = null;

    public Conn() {
        initializePostgresqlDatabase();
    }

    public Connection getConnection() {
        return connection;
    }

    public void initializePostgresqlDatabase() {
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            connection = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + databaseName, username, password);
            System.out.println("DB Connected");
        } catch (SQLExeption | IllegalArgumentException ex) {
            ex.printStackTrace(System.err);
        } finally {
            if (connection == null) {
                System.exit(-1);
            }
        }
    }
}
