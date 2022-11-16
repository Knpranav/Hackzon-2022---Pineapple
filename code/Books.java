import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Books implements List<Book>{
    ArrayList<Book> books = new ArrayList<Book>();
    @Override
    public int size() {
        return books.size();
    }

    @Override
    public boolean isEmpty() {
        return books.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return books.contains(o);
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
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
    public boolean add(Book e) {
        return books.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return books.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Book> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Book> c) {
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
        books.clear();
    }

    @Override
    public Book get(int index) {
        return books.get(index);
    }

    @Override
    public Book set(int index, Book element) {
        return books.set(index, element);
    }

    @Override
    public void add(int index, Book element) {
        books.add(index,element);
        
    }

    @Override
    public Book remove(int index) {
        return books.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return books.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ListIterator<Book> listIterator() {
        return books.listIterator();
    }

    @Override
    public ListIterator<Book> listIterator(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Book> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        return Collections.emptyList();
    }

    public Book getByID(int bookID){
        for(Book book : books){
            if(book.index == bookID){
                return book;
            }
        }
        return null;
    }
    
}
