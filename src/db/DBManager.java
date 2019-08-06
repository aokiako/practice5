package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBManager {
public static Connection getConnection() {
	try {
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "a_aoki", "aoki2005");
		return con;
	}catch (Exception e) {
		throw new IllegalStateException(e);
		}
}
public static void clone (Connection con) {
	if(con != null) {
		try {
			con.close();
		}catch (Exception e) {
		e.printStackTrace();
		}
	}
}
public static void close(PreparedStatement ps, Connection con) {
	if(ps != null) {
		try {
			ps.close();
		}catch (Exception e) {
		e.printStackTrace();
		}
	}

	if(con != null){
		try {
			con.close();
		}catch (Exception e) {
		e.printStackTrace();
		}
	}

}
}
