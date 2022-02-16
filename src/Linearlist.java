import java.util.Iterator;

public class Linearlist<T> implements Iterable<T> {

    T value;
    Linearlist<T> pnew;
    int count = 0;
    Linearlist<T> ptail;


    public Linearlist(T i) {
        value = i;

    }

    public void add(T i) {

        if (pnew == null) {
            pnew = new Linearlist<>(i);
            count++;
        } else {
            ptail = pnew;
            pnew.add(i);

        }
    }

    public void Printall() {
        System.out.println(value);
        if (pnew != null) {
            pnew.Printall();
        }
    }

    public void addtail(int i,T d) {
        if(i>0){
            pnew = ptail;
            pnew.add(d);
        }

    }

    public int count() {

        if (pnew != null) {
            count++;
            pnew.count = count;
            count = pnew.count();
        }

        return count;
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


    @Override
    public Iterator<T> iterator() {

        return new CustomIterator<>(this);
    }


}
