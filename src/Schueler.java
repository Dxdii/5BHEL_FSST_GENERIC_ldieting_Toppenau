public class Schueler implements Comparable<Schueler>{

    String name;

    public Schueler(String n) {
        this.name = n;
    }

    public void insert(String name) {
        this.name = name;
    }

    public String printall() {
        return name;
    }

    @Override
    public String toString() {
        return "Schueler{" + "name='" + name + '\'' + '}';
    }


    @Override
    public int compareTo(Schueler o) {
        return this.name.compareTo(o.name);
    }
}
