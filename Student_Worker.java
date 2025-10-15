/*
 * CSCI 185 M03
 * Fall 2025
 * M4: Polymorphism Lab
 * Author: Benjamin Chau
 * Date: 10/14/2025
 */

public class Student_Worker extends Person{
    private String ta_id;
    private String year;
    private int salary;
    private int num_vacation;
    private String course_taught;

    public Student_Worker(String n, int a, String ssn, boolean alive){
        super(n, a, ssn, alive);
        this.ta_id="T12345";
        this.year="Sophomore"; 
        this.course_taught="CSCI 185";
        this.num_vacation=8;
        salary=1000;
    }

     public void getPaid(){
        System.out.println("I get paid " + this.salary + " hourly");
    }

    public void getVacation(){
        System.out.println("Student Worker gets vacation every weekend.");
    }

    //demonstrate overriding toString method
    @Override
    public String toString(){
        String s= "Student Worker ";
        s+="TA ID: "+ this.ta_id + "\n";
        s+="Year: "+ this.year + "\n";
        s+="Salary: "+ this.salary + "\n";
        s+="Number of Vacation Days: "+ this.num_vacation + "\n";
        s+="Course Taught: "+ this.course_taught + "\n";
        return s;
    }
}
