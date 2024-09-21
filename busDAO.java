package busReservation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class busDAO {

	public void displayinfo() throws SQLException {
		String query = "select * from bus";
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println("Bus No: " + rs.getInt(1));
			if (rs.getInt(2) == 1) {
				System.out.println("Ac Bus");
			} else {
				System.out.println("Non Ac Bus");
			}
			System.out.println("Capacity" + rs.getInt(3));

		}
		System.out.println("-----------------------------");
	}

	public int getCapacity(int id) throws SQLException {
		String query = "select capacity from bus where id =" + id;
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
	}

}
