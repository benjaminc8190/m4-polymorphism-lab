/*
 * CSCI 185 M03
 * Fall 2025
 * M4: Polymorphism Lab
 * Author: Benjamin Chau
 * Date: 10/14/2025
 */

public class Secretary extends Person{
    private String fac_id;
    private int num_service;
    private int salary;
    private int num_vacation;

    public Secretary(String n, int a, String ssn, boolean alive){
        super(n, a, ssn, alive);
    }

    public void getPaid(){
        this.salary=25000;
        System.out.println("I get paid " + this.salary);
    }

    public void getVacation(){
        this.num_vacation=25;
        System.out.println("Secretary gets " + this.num_vacation + " days of vacation.");
    }

    public String toString(){
        String s= "Secretary " + super.toString();
        s+="Faculty ID: "+ this.fac_id + "\n";
        s+="Number of Years of Service: "+ this.num_service + "\n";
        s+="Salary: "+ this.salary + "\n";
        s+="Number of Vacation Days: "+ this.num_vacation + "\n";
        return s;
    }
}
