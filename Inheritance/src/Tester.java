public class Tester {

    public static void main(String[] args) {


        Person p = new Person("phani");
        p.setAge(23);
       // p.setName("phani");
        p.setPhoneNumber(243243);

        System.out.println(p);

        /*
        Person phani = new Person();

        Person suman = new Employee(); // Valid

        Employee xyz = new Employee(); // Valid

        //Employee abc = new Person(); - This is invalid


        Student s = new Student(); // Valid

       // Student s1 = new Employee(); - Invalid */


        Student s = new Student("phani",12345);


        System.out.println(s);

        Student s2 = new Student("phsni","AZ");


        if( s instanceof  Student){
            System.out.println(" This is an instace of Student ");
        }


/*
        Student s = new Student();

        s.setDepartment("CSE");
        s.setRollNumber(10092);

        s.setAge(32);
        s.setName("dfdf");
        s.setPhoneNumber(34254);

        System.out.println(s);*/

    }
}
