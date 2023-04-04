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
        b.addFirst("a");

        System.out.println(b.removeFirst());
        System.out.println(b.removeLast());
        System.out.println(b.removeLast());
        System.out.println(b.removeLast());
        System.out.println(b.removeLast());
        System.out.println(b.removeLast());
        System.out.println(b.removeLast());
        System.out.println(b.removeLast());
        System.out.println(b.removeLast());
        System.out.println(b.removeLast());
        System.out.println(b.removeLast());
        System.out.println(b.removeLast());
        System.out.println(b.removeLast());
    }
}