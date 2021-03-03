package dvdrental.com;

import java.sql.Connection;
import java.sql.Statement;

public class Insert_Value {

	public static void main(String[] args) {
		Connection connection = null;

		Statement statement = null;

		ConnectDB obj = new ConnectDB();

		connection = obj.get_connection();

		try {
			String query = "insert into employee(name,address)values ('Erick','Kyrgyzstan')";
			statement = connection.createStatement();
			statement.executeUpdate(query);

			System.out.println("Value inserted successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
