import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class BookTransactions implements List<BookTransaction>{

    ArrayList<BookTransaction> transactions = new ArrayList<BookTransaction>();
    @Override
    public int size() {
        return transactions.size();
    }

    @Override
    public boolean isEmpty() {
        return transactions.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return transactions.contains(o);
    }

    @Override
    public Iterator<BookTransaction> iterator() {
        return transactions.iterator();
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean add(BookTransaction e) {
        return transactions.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return transactions.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends BookTransaction> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends BookTransaction> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        transactions.clear();
    }

    @Override
    public BookTransaction get(int index) {
        return transactions.get(index);
    }

    @Override
    public BookTransaction set(int index, BookTransaction element) {
        return transactions.set(index, element);
    }

    @Override
    public void add(int index, BookTransaction element) {
        transactions.add(element);
        
    }

    @Override
    public BookTransaction remove(int index) {
        return transactions.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return transactions.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ListIterator<BookTransaction> listIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ListIterator<BookTransaction> listIterator(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<BookTransaction> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
