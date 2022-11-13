package adapterpattern;
import java.util.*;
import adapterpattern.*;
public class StudentMain {
    public static void main(String[] args) {
        List<Student> std = new ArrayList<>();

        SchoolStudent schoolObj = new SchoolStudent("Ami", "Bacca", "ab@yomail.com");
        CollegeStudent collegeStudent = new CollegeStudent("mui", "dhamra", "mui@bmail.com");

        std.add(schoolObj);
        /*
         * 
         * collegestudent obj in-compatible as it is not of type student so se need a adapter 
         */
        //std.add(collegeStudent);
        std.add(new CollgeStudentAdapter(collegeStudent));

        for (Student student : std) {
            System.out.println(student.toString());
        }

    }
}
