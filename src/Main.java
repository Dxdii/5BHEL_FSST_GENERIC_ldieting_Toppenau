public class Main {
    public static void main(String[] args) {
        Linearlist<Schueler> root = new Linearlist<>(new Schueler("Brenda"));
        root.add(new Schueler("Dietinger"));
        root.add(new Schueler("Oppenauer"));
        root.add(new Schueler("Heinz"));
        root.add(new Schueler("Heinzl"));
        root.Printall();
        root.get(3);
        System.out.println(root.count());
    }
}
