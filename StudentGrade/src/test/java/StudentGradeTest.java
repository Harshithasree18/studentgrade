import org.junit.Test;
import static org.junit.Assert.*;

public class StudentGradeTest {
    @Test public void returnsGradeA() { assertEquals("A", new StudentGrade().grade(95)); }
    @Test public void returnsGradeB() { assertEquals("B", new StudentGrade().grade(85)); }
    @Test public void returnsFailBelowFifty() { assertEquals("F", new StudentGrade().grade(40)); }
    @Test(expected = IllegalArgumentException.class) public void rejectsMarksOver100() { new StudentGrade().grade(101); }
}
