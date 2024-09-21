package busReservation;

public class bus {
	private int bus_no;
	private boolean Ac;
	private int capacity;

	public bus(int bus_no, boolean ac, int capacity) {
		this.setBus_no(bus_no);
		setAc(ac);
		this.setCapacity(capacity);
	}

	public int getBus_no() {
		return bus_no;
	}

	public void setBus_no(int bus_no) {
		this.bus_no = bus_no;
	}

	public boolean isAc() {
		return Ac;
	}

	public void setAc(boolean ac) {
		Ac = ac;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
