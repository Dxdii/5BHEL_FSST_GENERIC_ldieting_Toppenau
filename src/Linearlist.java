public class Linearlist<T> {

    T value;
    Linearlist<T> pnew;
    int count = 0;
    static int realcount;

    public Linearlist(T i) {
        value = i;

    }

    public void add(T i) {
        if (pnew == null) {
            pnew = new Linearlist<>(i);
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

    public int count() {

        if (pnew != null) {
            realcount++;
            pnew.count();

        }else{
            realcount++;
        }

        return realcount;
    }

    public void get(int i) {

        if (count == i) {
            System.out.println(value);

        } else {
            count++;
            pnew.count = count;
            pnew.get(i);

        }
    }
}
