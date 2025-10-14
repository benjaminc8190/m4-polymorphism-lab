public class Run {
    public static void main(String[] args) {
        Professor p = new Professor("Andrew", 19, "123-456-1234", true);
        System.out.println(p.toString());
        System.out.println("Paid: " + p.getPaid()+"\n");
        Secretary s = new Secretary("Becky", 20, "234-567-2345", true);
        System.out.println(s.toString());
        System.out.println("Paid: " + s.getPaid());
    }
}
