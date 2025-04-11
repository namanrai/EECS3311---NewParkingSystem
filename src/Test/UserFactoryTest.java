package Test;

import DesignPatterns.UserFactory;
import Models.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserFactoryTest {

    @Test
    public void testCreateStudentType1() {
        User user = UserFactory.createUser("student", "Alex", "alex@mail.com", "pass123", "STU123");
        assertTrue(user instanceof Student);
        assertEquals("Alex", user.getUsername());
    }

    @Test
    public void testCreateStudentType2() {
        User user = UserFactory.createUser("student", "Liam", "liam@mail.com", "secure456", "STU456");
        assertTrue(user instanceof Student);
        assertEquals("Liam", user.getUsername());
    }

    @Test
    public void testCreateFacultyType1() {
        User user = UserFactory.createUser("faculty", "Emma", "emma@uni.edu", "fac789", "FAC789");
        assertTrue(user instanceof Faculty);
        assertEquals("Emma", user.getUsername());
    }

    @Test
    public void testCreateFacultyType2() {
        User user = UserFactory.createUser("faculty", "Grace", "grace@uni.edu", "strongpass", "FAC999");
        assertTrue(user instanceof Faculty);
        assertEquals("Grace", user.getUsername());
    }

    @Test
    public void testCreateStaffType1() {
        User user = UserFactory.createUser("staff", "Noah", "noah@work.com", "admin123", "STA123");
        assertTrue(user instanceof Staff);
        assertEquals("Noah", user.getUsername());
    }

    @Test
    public void testCreateStaffType2() {
        User user = UserFactory.createUser("staff", "Ethan", "ethan@dept.com", "passpass", "STA456");
        assertTrue(user instanceof Staff);
        assertEquals("Ethan", user.getUsername());
    }

    @Test
    public void testCreateVisitorType1() {
        User user = UserFactory.createUser("visitor", "Olivia", "olivia@guest.com", "guest123", "VIS123");
        assertTrue(user instanceof Visitor);
        assertEquals("Olivia", user.getUsername());
    }

    @Test
    public void testCreateVisitorType2() {
        User user = UserFactory.createUser("visitor", "Sophia", "sophia@temp.com", "temp456", "VIS456");
        assertTrue(user instanceof Visitor);
        assertEquals("Sophia", user.getUsername());
    }

    @Test
    public void testUserTypeCaseInsensitive() {
        User user = UserFactory.createUser("StUdEnt", "Ryan", "ryan@school.com", "pw", "STU999");
        assertTrue(user instanceof Student);
    }

    @Test
    public void testCreateUserInvalidTypeThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserFactory.createUser("alien", "Zorg", "zorg@space.com", "galaxy", "Z123");
        });
        assertEquals("Invalid user type: alien", exception.getMessage());
    }
}