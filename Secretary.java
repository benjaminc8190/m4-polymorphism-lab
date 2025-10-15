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
        this.salary=25000;
        this.num_vacation=25;
    }

    public void getPaid(){
        System.out.println("I get paid a yearly total of " + this.salary + " bi-weekly.");
    }

    public void getVacation(){
        System.out.println("Secretary gets " + this.num_vacation + " days of vacation every month.");
    }

    //intentionally left out toString method to demonstrate inheritance of Person's toString method
}
