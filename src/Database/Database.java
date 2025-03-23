package Database;

import Models.Manager;
import Models.SuperManager;
import Models.User;
import java.util.*;

public class Database {
    private ArrayList<User> Users = new ArrayList<>();
    private ArrayList<Manager> Managers = new ArrayList<>();
    private SuperManager superManager = SuperManager.getInstance();
    private static final Database database = new Database();

    private Database() {
    }

    public void addAccount(User user) {
        Users.add(user);
    }

    public void addManager(Manager manager) {
        Managers.add(manager);
    }

    public ArrayList<User> getUsers() {
        return Users;
    }

    public ArrayList<Manager> getManagers() {
        return Managers;
    }

    public SuperManager getSuperManager() {
        return  superManager;
    }

    public boolean validUser(String username, String password) {
        for(User user: Users) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean validManager(String username, String password) {
        for(Manager manager: Managers) {
            if(manager.getUsername().equals(username) && manager.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static Database getInstance() {
        return  database;
    }
}
