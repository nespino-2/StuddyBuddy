import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Random;
import java.util.Collections;

public class Student {
    Integer[] arr = new Integer[11];
    Courses crseOptions = new Courses();
    String studentA[] = new String[11];
    
    public Student()
    {
        
        for (int i = 0; i < arr.length; i++) 
        {
                arr[i] = i;
        }
        Collections.shuffle(Arrays.asList(arr));
        
        studentA[0] = crseOptions.getCrse(arr[0]);
        studentA[1] = crseOptions.getCrse(arr[1]);
        studentA[2] = crseOptions.getCrse(arr[2]);
        studentA[3] = crseOptions.getCrse(arr[3]);
        studentA[4] = crseOptions.getCrse(arr[4]);
        studentA[5] = crseOptions.getCrse(arr[5]);
        studentA[6] = crseOptions.getCrse(arr[6]);
        studentA[7] = crseOptions.getCrse(arr[7]);
        studentA[8] = crseOptions.getCrse(arr[8]);
        studentA[9] = crseOptions.getCrse(arr[9]);
        studentA[10] = crseOptions.getCrse(arr[10]);
    
        System.out.println("//// Debug Code");
        System.out.println("crs2: " + studentA[1]);
        System.out.println("crs2: " + studentA[1]);
        System.out.println("crs3: " + studentA[2]);
        System.out.println("crs4: " + studentA[3]);
        System.out.println("crs5: " + studentA[4]);
        System.out.println("crs6: " + studentA[5]);
        
        /*
         * 
        
        if (crseOptions.getCrse1().contains("CSCI 0066") || 
            crseOptions.getCrse1().contains("CSCI0066") || 
            crseOptions.getCrse1().contains("CSCI 66") ||
            crseOptions.getCrse1().contains("CSCI66")) 
        {
            System.out.println(studentA[0]);
        }
        else
        {
            System.out.println("false");
        }
        
        */
    }
    
    public String getCourseOne()
    {
        return studentA[0];
    }
    
    public String getCourseTwo()
    {
        return studentA[1];
    }
    
    public String getCourseThree()
    {
        return studentA[2];
    }
    
    public String getCourseFour()
    {
        return studentA[3];
    }
    
    public String getCourseFive()
    {
        return studentA[4];
    }
    
    public String getCourseSix()
    {
        return studentA[5];
    }
}