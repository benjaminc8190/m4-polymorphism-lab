/*
 * CSCI 185 M03
 * Fall 2025
 * M4: Polymorphism Lab
 * Author: Benjamin Chau
 * Date: 10/14/2025
 */

public class Professor extends Person{
    private String fac_id;
    private String research_area;
    private int salary;
    private int num_vacation;

    public Professor(String n, int a, String ssn, boolean alive){
        super(n, a, ssn, alive);
        num_vacation=20;
    }

    public void getPaid(){
        this.salary+=50000;
        System.out.println("I get paid " + this.salary + " this semester.");
    }

    public void getVacation(){
        this.num_vacation=20;
        System.out.println("Professor gets " + this.num_vacation + " days of vacation.");
    }

    public String toString(){
        String s= "Professor " + super.toString();
        s+="Faculty ID: "+ this.fac_id + "\n";
        s+="Research Area: "+ this.research_area + "\n";
        s+="Salary: "+ this.salary + "\n";
        s+="Number of Vacation Days: "+ this.num_vacation + "\n";
        return s;
    }
}
