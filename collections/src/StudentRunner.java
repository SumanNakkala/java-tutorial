import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {


    public static void main(String[] args) {

        List<Student> students = List.of(new Student("suman",101),
                new Student("phani",103),
                new Student("hari",100));


        List<Student> studentsAL = new ArrayList<>(students);

        System.out.println(students);

        //students.sort();

        Collections.sort(studentsAL);

        System.out.println(studentsAL);
    }
}
