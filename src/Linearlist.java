public class Linearlist {

    int value;
    Linearlist pnew;
    int count;

    public Linearlist(int i) {
        value = i;

    }

    public void add(int i) {
        if (pnew == null) {
            pnew = new Linearlist(i);
            count++;
        } else {
            pnew.add(i);

        }
    }

    public void Printall() {
        System.out.println(value);
        if (pnew != null) {
            pnew.Printall();
        }


    }

    public void get(int i) {
        if (count == i) {
            System.out.println(value);

        } else {
            pnew.get(i);
        }
    }
}
