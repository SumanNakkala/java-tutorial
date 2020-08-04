

public class Employee {

    String empid;
    String name;
    long phoneNumber;
    Address homeAdress;
    Address workAdress;


    public Employee(){

    }
    public Employee(String empid, String name, long phoneNumber) {
        this.empid = empid;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(Address homeAdress) {
        this.homeAdress = homeAdress;
    }

    public Address getWorkAdress() {
        return workAdress;
    }

    public void setWorkAdress(Address workAdress) {
        this.workAdress = workAdress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid='" + empid + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", homeAdress=" + homeAdress +
                ", workAdress=" + workAdress +
                '}';
    }
}
