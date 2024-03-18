package genericAndSet;

public class Program {
    public static void main(String[] args){
        PrintService<String> ps = new PrintService<>();

        ps.add("Ola");

        System.out.println(ps.first());
        ps.print();
    }
}
