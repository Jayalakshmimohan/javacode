package Assessment1Kvaluent;

public class Vehicle {
	private String id;
	private String type;
	private boolean available;
	private int availableDays;

	public Vehicle(String id, String type, boolean available, int availableDays) {
		this.id = id;
		this.type = type;
		this.available = available;
		this.availableDays = availableDays;
	}

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public boolean isAvailable() {
		return available;
	}

	public int getAvailableDays() {
		return availableDays;
	}

	public void rent(int days) {
		available = false;
		availableDays -= days;
	}

	public void returnVehicle(int days) {
		available = true;
		availableDays += days;
	}
}
