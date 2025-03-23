package Models;

public abstract class User {
    public abstract String getEmail();
    public abstract String getPassword();
    public abstract String getLicensePlate();
    public abstract ParkingSpace getParkingSpace();
    public abstract String getUsername();

    //Card paymentInformation(String input);
    public abstract boolean registerAccount(String username, String password);
}
