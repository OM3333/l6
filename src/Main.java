import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomList<String> b = new CustomList<>();
        b.addFirst("d");
        b.addFirst("c");
        b.addFirst("b");
        b.addFirst("a");
        b.addFirst("a");
        b.addFirst("a");
        b.addFirst("a");
        b.addFirst("a");
        b.addFirst("a");
        b.addFirst("a");
        b.addFirst("a");
        b.addFirst("a");
        b.addFirst("a");
        b.addFirst("a");
        b.addFirst("a");
        b.addFirst("a");
        b.addFirst("a");
        b.addFirst("h");

        List<String> test1 = new CustomList<>();
        test1.add("test1");
        test1.add("test2");

        for(String element: b){
            System.out.println(element);
        }
    }
}