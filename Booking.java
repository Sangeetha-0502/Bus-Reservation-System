package busReservation;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Booking {
	String PassengerName;
	int bus_no;
	Date date;

	Booking() {// constructor is not only used for initialization it can do this type actions
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		PassengerName = sc.next();
		System.out.println("Enter Bus No:");
		bus_no = sc.nextInt();
		System.out.println("Enter Date dd-mm-yyyy");
		String dateInput = sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isAvailable() throws SQLException {
		busDAO bdao = new busDAO();
		bookingDAO bng = new bookingDAO();
		int capacity = bdao.getCapacity(bus_no);

		int booked = bng.getbookedCount(bus_no, date);

		return booked < capacity;

	}

}
