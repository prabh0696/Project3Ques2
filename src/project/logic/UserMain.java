package project.logic;

import project.logic.model.Address;
import project.logic.model.Dob;
import project.logic.model.User;

public class UserMain {

    public static void main(String[] args){
        User user1=new User();
        user1.setfName("Rahul");
        user1.setlName("Singh");
        //user1.setAge(25);
        user1.setSalary(3500.00);
        Address address=new Address();
        address.setCity("Montreal");
        address.setCountry("CA");
        address.setProvince("QC");
        address.setStreetName("Saint Mark");
        user1.setAddress(address);
        Dob dob1=new Dob();
        dob1.setDate(12);
        dob1.setMonth(8);
        dob1.setYear(1996);
        user1.setDob(dob1);


        User user2=new User();
        user2.setfName("Nikita");
        user2.setlName("John");
        //user2.setAge(35);
        user2.setSalary(2500.00);
        Address address2=new Address();
        address2.setCity("Ottawa");
        address2.setCountry("CA");
        address2.setProvince("ON");
        address2.setStreetName("Saint Matheiu");
        user2.setAddress(address2);
        Dob dob2=new Dob();
        dob2.setDate(18);
        dob2.setMonth(6);
        dob2.setYear(1998);
        user2.setDob(dob2);

        User user3=new User();
        user3.setfName("George");
        user3.setlName("Thomas");
        //user3.setAge(30);
        user3.setSalary(1800.00);
        Address address3=new Address();
        address3.setCity("Vancouver");
        address3.setCountry("CA");
        address3.setProvince("BC");
        address3.setStreetName("Street Okland");
        user3.setAddress(address3);
        Dob dob3=new Dob();
        dob3.setDate(17);
        dob3.setMonth(9);
        dob3.setYear(2000);
        user3.setDob(dob3);


        System.out.println(user1.toString());
        //TODO : WEB-4
        System.out.println(user2.toString());

        System.out.println(user3.toString());

        Double salaryAccumulatedUser1= UserDetails.SalaryAccumulated(user1);
        System.out.println(salaryAccumulatedUser1);
        Double salaryAccumulatedUser2= UserDetails.SalaryAccumulated(user2);
        System.out.println(salaryAccumulatedUser2);
        Double salaryAccumulatedUser3= UserDetails.SalaryAccumulated(user3);
        System.out.println(salaryAccumulatedUser3);
        //TODO : WEB-5
        Boolean isCanadian= UserDetails.VerifyCountry(user3);
        System.out.println(UserDetails.FullName(user3)+" is "+isCanadian);


    }
}
