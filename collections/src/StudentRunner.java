import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {

        return Integer.compare(s1.getId(),s2.getId());
    }
}

public class StudentRunner {


    public static void main(String[] args) {

        List<Student> students = List.of(new Student("suman",101),
                new Student("phani",103),
                new Student("hari",100));


        List<Student> studentsAL = new ArrayList<>(students);

        System.out.println(students);
        StudentComparator compa = new StudentComparator();

        studentsAL.sort( compa);

       Collections.sort(studentsAL);

        System.out.println(studentsAL);
    }
}
