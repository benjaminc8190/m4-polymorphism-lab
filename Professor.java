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
        salary=50000;
        num_vacation=20;
    }

    public int getPaid(){
        return this.salary;
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
