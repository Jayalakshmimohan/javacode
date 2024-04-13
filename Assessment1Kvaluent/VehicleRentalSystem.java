package Assessment1Kvaluent;

import java.util.List;

public class VehicleRentalSystem {
    private List<Vehicle> vehicles;

    public VehicleRentalSystem(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void processRentalRequest(RentalRequest request) throws InvalidRentalPeriodException, VehicleUnavailableException {
        if (request.getRentalPeriod() < 1) {
            throw new InvalidRentalPeriodException("Rental period must be at least 1 day");
        }

        Vehicle availableVehicle = null;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals(request.getType()) && vehicle.isAvailable() && vehicle.getAvailableDays() >= request.getRentalPeriod()) {
                availableVehicle = vehicle;
                break;
            }
        }

        if (availableVehicle == null) {
            throw new VehicleUnavailableException("Requested vehicle type \"" + request.getType() + "\" is available but not for the full requested rental period of " + request.getRentalPeriod() + " days.");
        }

        availableVehicle.rent(request.getRentalPeriod());

        int rentalCharge = request.getRentalPeriod() * 30; // Assuming rental charge is $30 per day
        System.out.println("Rental Confirmation:");
        System.out.println("- Vehicle ID: " + availableVehicle.getId());
        System.out.println("- Rental Period: " + request.getRentalPeriod() + " days");
        System.out.println("- Total Rental Charge: $" + rentalCharge);
    }
}
 