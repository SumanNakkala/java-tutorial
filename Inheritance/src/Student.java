public class Student  extends Person{



    String department;
    int rollNumber;
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Student(){

        //System.out.printf("Check point 1");
        super();
        System.out.println(" Hi I am subclass - Student Constructor");

    }

    public Student (String name,int rollNumber){

        super(name);
        this.rollNumber= rollNumber;
    }

    public Student (String name,String adress){

        super(name,adress);
    }


    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.name+ '\'' +
                "age='" + super.age+ '\'' +
                "department='" + department + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
