import java.util.Iterator;

class CustomIterator<T> implements Iterator<T> {
    Linearlist<T> d;

    // constructor
    CustomIterator(Linearlist<T> obj) {
        // initialize cursor
        d = obj;
    }


    // Checks if the next element exists
    public boolean hasNext() {
        if (d.pnew != null) {
            return true;
        } else {
            return false;
        }
    }

    // moves the cursor/iterator to next element
    public T next() {
            d = d.pnew;
            return d.value;
    }

    // Used to remove an element. Implement only if needed
    public void remove() {
        // Default throws UnsupportedOperationException.
        throw new UnsupportedOperationException();
    }
}