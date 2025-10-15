/*
 * CSCI 185 M03
 * Fall 2025
 * M4: Polymorphism Lab
 * Author: Benjamin Chau
 * Date: 10/14/2025
 */

public class Person{
    private String name;
    private int age;
    private String ssn;
    private boolean alive;

    public Person(String n, int a, String ssn, boolean alive){
        this.name=n;
        this.age=a;
        this.ssn=ssn;
        this.alive=alive;
    }

    public void getPaid(){
        System.out.println("I don't get paid");
    } 
    public void getVacation(){
        System.out.println("I get too many days of vacation.");
    }

    public String toString(){
        return "This is a Person";
    }

}