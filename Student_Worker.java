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
        salary=10000;
        num_vacation=5;
    }

     public void getPaid(){
        this.salary=10000;
        System.out.println("I get paid " + this.salary);
    }

    public void getVacation(){
        this.num_vacation=5;
        System.out.println("Student Worker gets " + this.num_vacation + " days of vacation.");
    }

    public String toString(){
        String s= "Student Worker " + super.toString();
        s+="TA ID: "+ this.ta_id + "\n";
        s+="Year: "+ this.year + "\n";
        s+="Salary: "+ this.salary + "\n";
        s+="Number of Vacation Days: "+ this.num_vacation + "\n";
        s+="Course Taught: "+ this.course_taught + "\n";
        return s;
    }
}
