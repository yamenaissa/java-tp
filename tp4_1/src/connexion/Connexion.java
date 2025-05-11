package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    private static final String URL = "jdbc:mysql://localhost:3306/demoJDBC";
    private static Connection conn;

    static {
        try {
            conn = DriverManager.getConnection(URL, "root", "");
            System.out.println("Connexion établie avec succès.");
        } catch (SQLException e) {
            System.err.println("Erreur lors de la connexion à la base de données : " + e.getMessage());
        }
    }

    public static Connection getConnexion() {
        return conn;
    }
}
