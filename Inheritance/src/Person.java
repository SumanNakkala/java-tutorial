public class Person  {



    public String name;
    public int age;
    public long phoneNumber;
    public String address;

    public Person(String name){

        this.name = name;
    }

    public Person(String name, String address){

        this.name=name;
        this.address=address;
    }


    public Person(){

        System.out.println(" Hi I am superclass - Person Constructor");
    }


    public String getName() {
        return name;
    }

    /*//public void setName(String name) {
        this.name = name;
    }*/

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                '}';
    }


}
