
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student stu1;
    Student studMultiGrades;

    @Before
    public void startup(){
        stu1 = new Student(1, "Skye S");
        stu1.addGrade(90);
        studMultiGrades = new Student(2, "Charles W");
        studMultiGrades.addGrade(90);
        studMultiGrades.addGrade(80);
        studMultiGrades.addGrade(50);
    }

    @Test
    public void testGetNameId(){
        assertEquals("Skye S", stu1.getName());
        assertEquals(1, stu1.getId());
    }

    @Test
    public void testAddGrade(){
        assertSame(90, stu1.getGrades().get(0));
    }

    @Test
    public void testGetGradeAverage(){
        assertEquals(90, stu1.getGradeAverage(), 0);
        assertEquals(73.33333333333333, studMultiGrades.getGradeAverage(), 0);
    }

}
