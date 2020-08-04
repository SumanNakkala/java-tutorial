class EmployeeTester {

    public static void main(String[] args) {

        Employee phani = new Employee("123","phani",12345);

        Address home = new Address("123 rt","hyd",50021);
        phani.setHomeAdress(home);

        Address work = new Address("556 rt","BAN",50029);
        phani.setWorkAdress(work);


        System.out.println(phani);


    }

}