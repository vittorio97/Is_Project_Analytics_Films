package connectionPool ;

import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Utility class per connettersi e ottenere la connessione al database MySQL
 * 
 * @author Antonio
 */
public class ConnectionPool {

	public static synchronized Connection getConnection() throws SQLException {

		Connection connection = null;
		System.out.println("-------- MySQL JDBC Test Connessione ------------");

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return connection;
		}

		System.out.println("MySQL JDBC Driver registrato!");

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3360/progettoweb", "root", "root");

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(new JFrame(), "Connessione al DataBase fallita!" + e.getMessage());
			return connection;
		}

		if (connection != null) {
			System.out.println("Connesso al DB!");
		} else {
			System.out.println("Failed to make connection!");
		}
		
		return connection;
	}
}
