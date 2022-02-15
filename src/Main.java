public class Main {
    public static void main(String[] args) {



        // Test 1:
        Linearlist root = new Linearlist(0);
        root.add(3);
        root.add(5);
        root.add(1);
        root.Printall();


        Linearlist <Integer> i1 = new Linearlist<Integer>(0);
        i1.add(3);
        i1.add(5);
        i1.Printall();

        Linearlist <String> s1 = new Linearlist<String>(0);
        s1.add("Test 01");
        s1.add("Test 02");
        s1.Printall();

        Linearlist <Schueler> schueler1 = new Linearlist<Schueler>();
        schueler1.add(new Schueler("Schueler 1"));
        schueler1.add(new Schueler("Schueler 2"));

        // System.out.println(p.getObj());


    }
}
