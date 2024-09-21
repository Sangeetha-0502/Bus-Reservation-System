package busReservation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class bookingDAO {

	public int getbookedCount(int bus_no, Date date) throws SQLException {

		String query = "select count(passenger_name) from booking where bus_no=? and travel_date = ?";
		Connection con = DBConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		pst.setInt(1, bus_no);
		pst.setDate(2, sqldate);
		ResultSet rs = pst.executeQuery();
		rs.next();
		return rs.getInt(1);

	}

	public void addbooking(Booking booking) throws SQLException {
		String query = "insert into booking values(?,?,?)";
		Connection con = DBConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, booking.PassengerName);
		pst.setInt(2, booking.bus_no);
		java.sql.Date sqldate = new java.sql.Date(booking.date.getTime());
		pst.setDate(3, sqldate);
		pst.executeUpdate();
	}

}
