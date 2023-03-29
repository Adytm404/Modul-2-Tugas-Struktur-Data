import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> data = new LinkedList<String>();
        data.add("Sapi");
        data.add("Kambing");
        data.add("Sapi");
        data.add("Babi");
        data.add("Ular");
        data.add("Ular");

        System.out.println("Print All data: " + data);

        data.remove("Sapi");
        data.remove("Ular");

        LinkedList<String> data2 = new LinkedList<String>();
        data2.add("Sapi");
        data2.add("Ular");
        System.out.println("Hewan yang dihapus: " +data2);
        System.out.println("Output Hewan: " + data);
        data.remove(0);


    }
}
