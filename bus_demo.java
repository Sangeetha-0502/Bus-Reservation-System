package busReservation;

import java.util.Scanner;

public class bus_demo {
	public static void main(String[] args) {
		try {
			busDAO bdao = new busDAO();
			bdao.displayinfo();

			int EnterOption = 1;
			Scanner sc = new Scanner(System.in);
			while (EnterOption == 1) {
				System.out.println("Enter 1 to Book and 0 to Exit");
				EnterOption = sc.nextInt();
				if (EnterOption == 1) {
					Booking booking = new Booking();
					if (booking.isAvailable()) {
						bookingDAO bng = new bookingDAO();
						bng.addbooking(booking);
						System.out.println("Your Booking is Confirmed.Thanks For Booking");

					} else {
						System.out.println("Sorry!Bus is Full.Kindly Try another Bus or Date");
					}

				}

			}
			sc.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
