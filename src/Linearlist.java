import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Linearlist<T> implements  Iterable<T> {

    T value;
    Linearlist<T> pnew;
    int count = 0;


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
        if(pnew!=null) {
            return this.pnew.iterator();
        }else{
            return this.iterator();
        }
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
