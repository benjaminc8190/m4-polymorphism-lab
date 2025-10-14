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

    public Person(){
        this.name="unknown";
        this.age=18;
        this.ssn="unknown";
        this.alive=false;
    }
    public Person(String n, int a, String ssn, boolean alive){
        this.name=n;
        this.age=a;
        this.ssn=ssn;
        this.alive=alive;
    }

    public void setName(String n){
        this.name=n;
    }
    public void setAge(int a){
        this.age=a;
    }
    public void setSSN(String ssn){
        this.ssn=ssn;
    }
    public void setAlive(boolean alive){
        this.alive=alive;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getSSN(){
        return this.ssn;
    }
    public boolean getAlive(){
        return this.alive;
    }

    public String toString(){
        String s="Name: "+ this.name + "\n";
        s+="Age: "+ this.age + "\n";
        s+="SSN: "+ this.ssn + "\n";
        s+="Alive: "+ this.alive + "\n";
        return s;
    }

}