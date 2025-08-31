import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MatchMakerTest {
    private Student s1;
    private Student s2;
    private MatchMaker matcher;

    @BeforeEach
    void setUp() {
        ArrayList<String> courses1 = new ArrayList<>();
        courses1.add("CPSC 1010");
        courses1.add("CPSC 2120");

        ArrayList<String> courses2 = new ArrayList<>();
        courses2.add("CPSC 2120"); // overlap
        courses2.add("MATH 1080");

        s1 = new Student("001", "Alice", courses1);
        s2 = new Student("002", "Bob", courses2);

        ArrayList<Student> all = new ArrayList<>();
        all.add(s1);
        all.add(s2);

        matcher = new MatchMaker(all);
    }

    @Test
    void testCourseOverlapDetection() {
        // Bob and Alice should share CPSC 2120
        assertTrue(s2.getCourse().contains("CPSC 2120"));
        assertTrue(s1.getCourse().contains("CPSC 2120"));
    }

    @Test
    void testAvailabilityOverlap() {
        // Alice is available Mon 10-12
        s1.addAvailability("Monday", 10, 12);
        // Bob is available Mon 11-13
        s2.addAvailability("Monday", 11, 13);

        // Their overlap should be [11]
        ArrayList<Integer> overlap = new ArrayList<>(s1.getAvailability().get("Monday"));
        overlap.retainAll(s2.getAvailability().get("Monday"));

        assertEquals(1, overlap.size());
        assertEquals(11, overlap.get(0));
    }

    @Test
    void testSessionCreationRemovesAvailability() {
        s1.addAvailability("Tuesday", 14, 16); // 14, 15
        s2.addAvailability("Tuesday", 14, 16);

        // Manually simulate creating a session at 14
        s1.addSession("Tuesday", 14);
        s2.addSession("Tuesday", 14);
        s1.removeAvailability("Tuesday", 14, 15);
        s2.removeAvailability("Tuesday", 14, 15);

        assertTrue(s1.getSessions().get("Tuesday").contains(14));
        assertFalse(s1.getAvailability().get("Tuesday").contains(14));
    }
}