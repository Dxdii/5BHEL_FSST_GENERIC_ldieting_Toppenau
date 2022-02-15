public class Main {
    public static void main(String[] args) {
    Linearlist<Integer> root = new Linearlist<>(1);
    root.add(3);
    root.add(4);
    root.add(5);
    root.Printall();
    root.get(4);
        System.out.println(root.count());
    }
}
