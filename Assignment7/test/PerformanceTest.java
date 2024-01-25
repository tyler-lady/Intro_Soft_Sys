import org.junit.jupiter.api.Test;
import problem3.Instructor;
import problem3.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerformanceTest {
    Student s = new Student("Sheena", "B");
    Instructor i = new Instructor("Camp", "Worst");

    @Test
    public void getPerfTest(){
        assertEquals(3.0, s.getPerformance());
        assertEquals(1.0, i.getPerformance());
    }
}
