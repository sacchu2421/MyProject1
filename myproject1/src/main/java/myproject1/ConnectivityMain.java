package myproject1;

import java.sql.SQLException;

public class ConnectivityMain {

	public static void main(String[] args) {
		DatabaseConnectivity db = new DatabaseConnectivity();
		// TODO Auto-generated method stub
		try {
		db.connectivity();
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
