public class Student  extends Person{



    String department;
    int rollNumber;
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

/*    @Override
    public String toString() {
        return "Student{" +
                "age='" + super.age+ '\'' +
                "department='" + department + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }*/
}
