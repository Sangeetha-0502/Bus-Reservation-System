package busReservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static final String url = "jdbc:mysql://localhost:3306/busresv";
	private static final String username = "root";
	private static final String password = "sangee@mysql2024";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);

	}

}
