package org.example;
import com.google.gson.Gson;

public class Main {
    public static EmployeeDetails getCompanyData(EmployeeDetails company) {
        company.setCompanyName("Accolite Digital");
        company.setemployeename("Keerthi K");
        company.setemployeeID(1506);
        return company;
    }
    public static void main(String[] args) {
        EmployeeDetails company = new EmployeeDetails();
        company = getCompanyData(company);
        System.out.println("The JSON representation  is ");
        System.out.println(new Gson().toJson(company));

    }
}
