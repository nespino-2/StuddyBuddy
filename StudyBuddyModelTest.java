import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * Test the Calculator class
 */
public class StudyBuddyModelTest
{ 
    @Test
    public void testNoDuplicatesStudentA()
    {
        StudyBuddyModel stdMdl = new StudyBuddyModel(); 
        assertEquals( true  , ( (stdMdl.StudentACourseOne()) != (stdMdl.StudentACourseTwo()) )
                     && ( (stdMdl.StudentACourseTwo()) != (stdMdl.StudentACourseThree()) ) &&
                     ( (stdMdl.StudentACourseThree()) != (stdMdl.StudentACourseFour()) ) &&
                     ( (stdMdl.StudentACourseFour()) != (stdMdl.StudentACourseFive()) ) &&
                     ( (stdMdl.StudentACourseFive()) != (stdMdl.StudentACourseSix()) ) );
    }
    
    @Test
    public void testNoDuplicatesStudentB()
    {
        StudyBuddyModel stdMdl = new StudyBuddyModel(); 
        assertEquals( true  , ( (stdMdl.StudentBCourseOne()) != (stdMdl.StudentBCourseTwo()) )
                     && ( (stdMdl.StudentBCourseTwo()) != (stdMdl.StudentBCourseThree()) ) &&
                     ( (stdMdl.StudentBCourseThree()) != (stdMdl.StudentBCourseFour()) ) &&
                     ( (stdMdl.StudentBCourseFour()) != (stdMdl.StudentBCourseFive()) ) &&
                     ( (stdMdl.StudentBCourseFive()) != (stdMdl.StudentBCourseSix()) ) );
    }
    
    @Test
    public void testNoDuplicatesStudentC()
    {
        StudyBuddyModel stdMdl = new StudyBuddyModel(); 
        assertEquals( true  , ( (stdMdl.StudentCCourseOne()) != (stdMdl.StudentCCourseTwo()) )
                     && ( (stdMdl.StudentCCourseTwo()) != (stdMdl.StudentCCourseThree()) ) &&
                     ( (stdMdl.StudentCCourseThree()) != (stdMdl.StudentCCourseFour()) ) &&
                     ( (stdMdl.StudentCCourseFour()) != (stdMdl.StudentCCourseFive()) ) &&
                     ( (stdMdl.StudentCCourseFive()) != (stdMdl.StudentCCourseSix()) ) );
    }
    

}
