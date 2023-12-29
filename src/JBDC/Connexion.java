 package JBDC;
import java.sql.*;

 public class Connexion {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java";
        String user = "root";
        String password = "";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connexion réussie à la base de données.");

            // Vous pouvez ajouter votre code pour interagir avec la base de données ici.

        } catch (SQLException e) {
            System.out.println("Erreur de connexion à la base de données : " + e.getMessage());
        }
    }
    private static void createDepartementTable(Connection connection) throws SQLException {
        String createTableQuery = "CREATE TABLE IF NOT EXISTS departement (" +
                "Id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                "intitule VARCHAR(255)," +
                "responsable_nom VARCHAR(255)," +
                "responsable_prenom VARCHAR(255)," +
                "responsable_email VARCHAR(255)," +
                "responsable_grade VARCHAR(255))";

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(createTableQuery);
        }
    }

    private static void insertDataIntoDepartement(Connection connection) throws SQLException {
        String insertDataQuery = "INSERT INTO Departements (intitule, responsable_nom, responsable_prenom, responsable_email, responsable_grade) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertDataQuery, Statement.RETURN_GENERATED_KEYS)) {
            // Insertion de données pour un département
            ((PreparedStatement) preparedStatement).setString(1, "45");
            preparedStatement.setString(2, "informatique");
            preparedStatement.setString(3, "admministrateur1");
            ((PreparedStatement) preparedStatement).setString(1, "46");
            preparedStatement.setString(2, "Maths");
            preparedStatement.setString(3, "admministrateur2");
            ((PreparedStatement) preparedStatement).setString(1, "47");
            preparedStatement.setString(2, "Physique");
            preparedStatement.setString(3, "admministrateur3");
            ((PreparedStatement) preparedStatement).setString(1, "48");
            preparedStatement.setString(2, "Arabe");
            preparedStatement.setString(3, "admministrateur4");
            // Vous pouvez ajouter d'autres insertions de données ici pour d'autres départements
        }
    }
}