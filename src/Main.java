import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Linearlist<Integer> root1 = new Linearlist<>(1);
        root1.add(2);
        root1.add(3);
        root1.get(2);
        root1.Printall();

        Linearlist<Schueler> root = new Linearlist<>(new Schueler("Jannik"));
        root.add(new Schueler("Dietinger"));
        root.add(new Schueler("Oppenauer"));
        root.add(new Schueler("Heinz"));
        root.add(new Schueler("Heinzl"));
        //noch nicht funktionsfähig Ptail wird gemerkt aber sotiervorgang funktioniert nocht nicht.
        root.addtail(new Schueler("Guttenbrunner").compareTo(root.value),new Schueler("Guttenbrunner"));

        root.Printall();
        root.get(1);
        System.out.println(root.count());




        for (Schueler s:root)
        {
            System.out.println(s.name);
        }
    }
}
