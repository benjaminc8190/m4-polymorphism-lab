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
        salary=50000;
    }

    public void getPaid(){
        System.out.println("I get paid a yearly total of " + this.salary + " monthly.");
    }

    public void getVacation(){
        this.num_vacation=20;
        System.out.println("Professor gets " + this.num_vacation + " days of vacation every 3 months.");
    }
    //intentionally left out toString method to demonstrate inheritance of Person's toString method
}
