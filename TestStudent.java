import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class TestStudent
{

    private Student student;

    @BeforeEach
    void setUp()
    {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("CPSC 1010");
        courses.add("CPSC 2120");
        student = new Student("123", "Alice", courses);
    }

    @Test
    void testAddAndGetAvailability()
    {
        student.addAvailability("Monday", 10, 12);
        HashMap<String, ArrayList<Integer>> avail = student.getAvailability();
        assertTrue(avail.containsKey("Monday"));
        assertEquals(2, avail.get("Monday").size()); // 10, 11
        assertTrue(avail.get("Monday").contains(10));
        assertTrue(avail.get("Monday").contains(11));
    }

    @Test
    void testRemoveAvailability()
    {
        student.addAvailability("Tuesday", 13, 15);
        student.removeAvailability("Tuesday", 13, 14);
        HashMap<String, ArrayList<Integer>> avail = student.getAvailability();
        assertTrue(avail.containsKey("Tuesday"));
        assertEquals(1, avail.get("Tuesday").size()); // should only have 14 left
        assertFalse(avail.get("Tuesday").contains(13));
    }

    @Test
    void testAddSession()
    {
        student.addSession("Wednesday", 9);
        student.addSession("Wednesday", 10);
        HashMap<String, ArrayList<Integer>> sessions = student.getSessions();
        assertTrue(sessions.containsKey("Wednesday"));
        assertEquals(2, sessions.get("Wednesday").size());
        assertTrue(sessions.get("Wednesday").contains(9));
    }

    @Test
    void testPreventDuplicateSession() {
            student.addSession("Thursday", 14);
            student.addSession("Thursday", 14); // duplicate

            assertEquals(1, student.getSessions().get("Thursday").size());
        }

        @Test
        void testRemoveSessions() {
            student.addSession("Friday", 8);
            student.removeSessions("Friday", 8);

            assertTrue(student.getSessions().get("Friday").isEmpty());
        }
    }

