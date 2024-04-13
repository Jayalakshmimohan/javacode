package Assessment1Kvaluent;

public class RentalRequest {
	private String type;
	private int rentalPeriod;

	public RentalRequest(String type, int rentalPeriod) {
		this.type = type;
		this.rentalPeriod = rentalPeriod;
	}

	public String getType() {
		return type;
	}

	public int getRentalPeriod() {
		return rentalPeriod;
	}
}
