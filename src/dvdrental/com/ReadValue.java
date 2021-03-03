package dvdrental.com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadValue {

	public static void main(String[] args) {

		Connection connection = null;

		Statement statement = null;
		ResultSet rs = null;

		ConnectDB obj = new ConnectDB();
		connection = obj.get_connection();

		try {

			String query = "select * from employee";
			statement = connection.createStatement();
			rs = statement.executeQuery(query);

			while (rs.next()) {
				System.out.print(rs.getString("name") + " ");
				System.out.print(rs.getString("sl_no") + " ");
				System.out.println(rs.getString("address"));
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
