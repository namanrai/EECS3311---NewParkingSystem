package Test;

import static org.junit.jupiter.api.Assertions.*;

import Models.Manager;
import org.junit.jupiter.api.Test;
import Models.SuperManager;


/**
 * This the test class for the SuperManager class which is a
 * singleton class.
 */

public class SuperManagerTest {


    /**
     * This Test case verifies that the singleton instance of SuperManager is not null.
     */

    @Test
    void TestChecknullInstance(){
        assertNotNull(SuperManager.getInstance());
    }

    /**
     * This test case checks whether the singleton instances's username is correct.
     * which is "admin"
     */

    @Test
    void TestgetCorrectUsername(){
        assertEquals("admin", SuperManager.getInstance().getUsername());
    }

    /**
     * This test case checks whether the singleton instances's password is correct.
     * which is "admin"
     */

    @Test
    void TestgetCorrectPassword(){
        assertEquals("admin", SuperManager.getInstance().getPassword());
    }

    /**
     * This test case checks whether repeated instantiations to
     * the singleton class provide the same object.
     */

    @Test
    void TestSingletonClass(){
        assertEquals(SuperManager.getInstance(), SuperManager.getInstance());
    }

    /**
     * This test case checks whether calling of the method
     * createManagerAccount does not create the null manager.
     */

    @Test
    void TestnullmanagerAccount(){
        assertNotNull(SuperManager.getInstance().createManagerAccount(true));
    }

    /**
     * This test case checks whether calling of the method
     * createManagerAccount multiple times creates distinct manager accounts.
     */

    @Test
    void TestmultipleManagerCreation(){
        Manager m = SuperManager.getInstance().createManagerAccount(true);
        Manager m1 = SuperManager.getInstance().createManagerAccount(true);
        assertNotEquals(m, m1);
    }

    /**
     * This test case checks whether calling of the method
     * createManagerAccount with the flag set to false still returns a non-null manager.
     */

    @Test
    void TestCreateManagerAccountWithFalseFlag() {
        Manager m1 = SuperManager.getInstance().createManagerAccount(false);
        assertNotNull(m1);
    }

    /**
     * This test case verifies if multiple instantiations of the super manager class returns
     * the same super manager.
     */

    @Test
    void TestSingletonInstanceReference() {
        SuperManager Managerinstance1 = SuperManager.getInstance();
        SuperManager Managerinstance2 = SuperManager.getInstance();
        SuperManager Managerinstance3 = SuperManager.getInstance();
        assertSame(Managerinstance1, Managerinstance2);
        assertSame(Managerinstance1, Managerinstance3);
    }




    /**
     * This test case verifies if multiple instantiations of the super manager class returns
     * the same username and is consistent among all calls.
     */

    @Test
    void TestSameUserCredentials() {
        SuperManager superManager1 = SuperManager.getInstance();
        SuperManager superManager2 = SuperManager.getInstance();

        assertEquals(superManager1.getUsername(), superManager2.getUsername());
    }

    /**
     * This test case verifies if multiple instantiations of the super manager class returns
     * the same password and is consistent among all calls.
     */

    @Test
    void TestSamePassCredentials() {
        SuperManager superManager1 = SuperManager.getInstance();
        SuperManager superManager2 = SuperManager.getInstance();
        assertEquals(superManager1.getPassword(), superManager2.getPassword());
    }


















}
