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
        salary=25000;
        num_vacation=15;
    }

    public int getPaid(){
        return this.salary;
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
