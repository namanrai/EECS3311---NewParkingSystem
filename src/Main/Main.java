package Main;

import Database.Database;
import DesignPatterns.*;
import HelperFunctions.CardPayment;
import HelperFunctions.ReciptDecorator;
import Models.Card;
import Models.Manager;
import Models.User;
import Models.SuperManager;


import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
        //User Test
        System.out.println("User Test \nHello, World!");
        User ahmad = UserFactory.createUser("Student","ahmad","ahmadzaki@gmail.com","123","ON8828");
        System.out.println(ahmad.getUsername() + "\n\nDatabase Test");

        //Database Test
        Database database = Database.getInstance();
        database.addAccount(ahmad);
        System.out.println(database.getUsers().get(0).getEmail());
        User naman = UserFactory.createUser("Student","naman","naman@gmail.com","123aB!456","ON8888");
        naman.registerAccount(naman.getUsername(),naman.getPassword());
        System.out.println(database.getUsers().get(1).getUsername());
        ArrayList<User> unvalidatedUsers = database.getUnvalidatedUsers();
        System.out.println(unvalidatedUsers.size() + "\n\nSuperManager, Manager and Proxy test");

        //SuperManager, Manager and Proxy test

        //initialization
        SuperManager superManager = database.getSuperManager();
        // Create a manager with full access to the Proxy
        Manager manager = superManager.createManagerAccount(true);
        // Checking if the new manager exists in database
        System.out.println("Username: " + database.getManagers().get(0).getUsername() + " Password: " + database.getManagers().get(0).getPassword() + "\n");

        //as a manager
            manager.validateUsers(ahmad.getUsername());
            System.out.println(database.getUsers().get(0).getisValidated());
            manager.addParkingLot("Lot-A");
            manager.addParkingLot("Lot-B");
            manager.enableParkinglot("Lot-A");
            manager.disableParkinglot("Lot-B");
            manager.enableParkingspace("Lot-A", "Lot-A-1");
            manager.disableParkingspace("Lot-A", "Lot-A-1");
            manager.removeParkingLot("Lot-B");

            //as a non-manager
            ParkingProxy userProxy = new ParkingProxy(false); // Non-manager
            Manager user = new Manager(userProxy);
            user.addParkingLot("Lot-C"); // Unauthorized access
            user.enableParkinglot("Lot-A"); // Unauthorized access
            user.removeParkingLot("Lot-A"); // Unauthorized access


            Card card = new Card("1234-5678-9012-3456", ahmad, "123 Street", "VISA", 123,
                    2025);
            PaymentMethod payment = new CardPayment(100.0f, card);


            PaymentMethod paymentWithReceipt = new ReciptDecorator(payment);
            boolean success = paymentWithReceipt.processPayment();
            System.out.println("Payment processed: " + success);
    }
}
