package Models;
import Database.Database;
import DesignPatterns.ParkingProxy;
/*
This method uses the singleton patten, to generate just one instance
of the SuperManager account type.
 */




public class SuperManager {

    private static final SuperManager SuperManager1 = new SuperManager("admin","admin");//Early Init instead of Lazy Init
    private String username;
    private String password;


   /*
    private constructor so noby outside class can access this.
     */

    private SuperManager(String username, String password){
        this.username = username;
        this.password = password;
    }

    /*
    This method returns the single instance of the super manager class. Following with
    the singleton design pattern
     */
    public static SuperManager getInstance(){
        return SuperManager1;
    }

     /*
     This method return an account. Satisfying the 2nd UserReq, which informs the Supermanager
     can create multiple manager accounts.

     @Input String role
     @return ManagerAccountfactory.createAccount();
      */

    public Manager createManagerAccount(boolean isManager) {
        // Create a ParkingProxy instance for the new Manager
        ParkingProxy parkingProxy = new ParkingProxy(isManager);
        // Create and a new Manager with the ParkingProxy
        Manager newManager = new Manager(parkingProxy);
        // Added new Manager to database
        Database.getInstance().addManager(newManager);
        // Return new Manager
        return newManager;
    }


}
