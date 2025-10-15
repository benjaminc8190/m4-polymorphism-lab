public class Run {
    public static void main(String[] args) {

        Professor p = new Professor("Andrew", 19, "123-456-1234", true);
        System.out.println("Professor Info:");
        p.getPaid();
        p.getVacation();

        Person s = new Secretary("Beth", 25, "987-654-3210", false);
        System.out.println("\nSecretary Info:");
        s.getPaid();
        s.getVacation();

        Person sw = new Student_Worker("Charlie", 30, "555-555-5555", true);
        System.out.println("\nStudent Worker Info:");
        sw.getPaid();
        sw.getVacation();

        Person per = new Person("Diana", 22, "111-222-3333", false);
        System.out.println("\nPerson Info:");
        per.getPaid();
        per.getVacation();

        System.out.println("\nToString Methods:");
        System.out.println("This is person class toString method: " + per.toString());
        System.out.println("This is professor class toString method: " + p.toString());
        System.out.println("This is secretary class toString method: " + s.toString());
        System.out.println("This is student worker class toString method: " + sw.toString());

        //upcasting demonstration:
        sw = new Person("New Charlie", 28, "444-444-4444", true);
        System.out.println("\nUpcast Student Worker to Person:");
        sw.getPaid(); //calls Person's getPaid method
        sw.getVacation(); //calls Person's getVacation method
    }
}
