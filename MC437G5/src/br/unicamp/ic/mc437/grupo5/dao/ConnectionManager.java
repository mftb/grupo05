package br.unicamp.ic.mc437.grupo5.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
			
		public  static Connection getConnection(){
			Properties prop = new Properties();
			Connection connection = null;
			try {
				FileReader reader = new FileReader("resources/connection.properties");
				prop.load(reader);
				System.out.println(prop.toString());
				connection = DriverManager
						.getConnection(prop.getProperty("server"),prop.getProperty("user"), prop.getProperty("password"));
			} 
			catch (SQLException  e) {
				System.out.println("Fail to connect with the DB");
				e.printStackTrace();
			}
			catch (FileNotFoundException  e) {
				System.out.println("Fail to load file resources/datasource.properties");
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return connection;
		}
}
