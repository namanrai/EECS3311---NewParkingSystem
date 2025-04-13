package Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import HelperFunctions.PasswordValidator;

/**
 * This class is a test class for the class Passwordvalidator, which is a utility class
 * which is used to verify if the user and other accounts have a strong password.
 */

public class PasswordValidatorTest {


    /**
     * This test case checks for an empty string password
     */

    @Test
    void testEmptyPasswordString() {
        assertFalse(PasswordValidator.isStrongPassword(""));
    }

    /**
     * This test cases verifies if the given password is not null.
     */

    @Test
    void testnullPasswordinput() {
        assertFalse(PasswordValidator.isStrongPassword(null));
    }

    /**
     * This test case verifies if the provided password string, fits the requirements for strong password.
     */

    @Test
    void testValidStrongPassword() {
        assertTrue(PasswordValidator.isStrongPassword("Abc123!@"));
    }

    /**
     * This test case verifies if the provided password string, fits the requirements for strong password.
     */

    @Test
    void testAnotherStrongPassword() {
        assertTrue(PasswordValidator.isStrongPassword("12A3bc@#$"));
    }

    /**
     * This test case verifies if the provided password string's length. and checks whether it's too small
     * .
     */
    @Test
    void testShortlength() {
        assertFalse(PasswordValidator.isStrongPassword("12b"));
    }

    /**
     * This test case verifies if the provided password string
     * is all lowercase. If that's the scenario then the test should fail
     * .
     */
    @Test
    void testnoUpperCaseInput() {
        assertFalse(PasswordValidator.isStrongPassword("testpassword"));
    }

    /**
     * This test case verifies if the provided password string
     * is all Uppercase. If that's the scenario then the test should fail
     * .
     */

    @Test
    void testpasswordlowerCaseInout() {
        assertFalse(PasswordValidator.isStrongPassword("TESTPASSWORD"));
    }

    /**
     * This test case verifies if the provided password string
     * has no numbers. If that's the scenario then the test should fail
     * .
     */

    @Test
    void testifDigitExist() {
        assertFalse(PasswordValidator.isStrongPassword("TESTPASSWORD"));
    }

    /**
     * This test case verifies if the provided password string
     * has no special characters. If that's the scenario then the test should fail
     * .
     */

    @Test
    void test_hasspecialCharacters() {
        assertFalse(PasswordValidator.isStrongPassword("PassWordTesT"));
    }


    /**
     * This test case verifies if the provided password string
     * has an unexpected special character. If that's the scenario then the test should fail
     * .
     */

    @Test
    void test_unexpectedSpecialCharacter(){
        assertFalse(PasswordValidator.isStrongPassword("PassWord~"));
    }






}