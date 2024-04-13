package Assessment1Kvaluent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new Vehicle("1", "Car", true, 5));
		vehicles.add(new Vehicle("2", "Bike", true, 2));

		VehicleRentalSystem rentalSystem = new VehicleRentalSystem(vehicles);

		Scanner scanner = new Scanner(System.in);

		try {

			System.out.print("Enter vehicle type (Car/Bike): ");
			String vehicleType = scanner.nextLine();
			System.out.print("Enter rental period (in days): ");
			int rentalPeriod = scanner.nextInt();

			RentalRequest request = new RentalRequest(vehicleType, rentalPeriod);
			rentalSystem.processRentalRequest(request);
		} catch (InvalidRentalPeriodException | VehicleUnavailableException e) {
			System.out.println("Exception: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
