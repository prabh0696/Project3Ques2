package project.logic;

import project.logic.model.User;

public class UserDetails {


    public static String FullName(User user){
        String fullName=user.getfName()+" "+user.getlName();

        return fullName;
    }

    public static Boolean VerifyCountry(User user){
        String country=user.getAddress().getCountry();
        if(country=="CA"){
            return true;
        }
        else {
            return false;
        }
    }

    // TODO : RQ - 2
    public static Double SalaryAccumulated(User user){
        String province=user.getAddress().getProvince();
        int BirthYear=user.getDob().getYear();
        int originalAge=0,remainingAge=0;
        double salaryHike=0,totalSalary=0;
        originalAge=2020-BirthYear;
        salaryHike=user.getSalary();
        if(province=="QC"){
            remainingAge=55-originalAge;
        }
        else if(province=="ON"){
            remainingAge=58-originalAge;
        }
        else{
            remainingAge=61-originalAge;
        }
        for(int i=1;i<=remainingAge;i++){
            salaryHike=salaryHike+salaryHike*0.02 ;
            totalSalary+=salaryHike;
        }
        return totalSalary;

    }


}
