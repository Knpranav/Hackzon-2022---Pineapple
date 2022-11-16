import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class People implements List<Person> {

    ArrayList<Person> people = new ArrayList<Person>();

    @Override
    public int size() {
        return people.size();
    }

    @Override
    public boolean isEmpty() {
        return people.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return people.contains(o);
    }

    @Override
    public Iterator<Person> iterator() {
        return people.iterator();
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
    public boolean add(Person e) {
        return people.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return people.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Person> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Person> c) {
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
        people.clear();
    }

    @Override
    public Person get(int index) {
        // TODO Auto-generated method stub
        return people.get(index);
    }

    @Override
    public Person set(int index, Person element) {
        return people.set(index, element);
    }

    @Override
    public void add(int index, Person element) {
        people.add(index, element);
        
    }

    @Override
    public Person remove(int index) {
        return people.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return people.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ListIterator<Person> listIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ListIterator<Person> listIterator(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Person> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        return null;
    }

    public Person getByID(int userID){
        for(Person person: people){
            if(person.id == userID){
                return person;
            }
        }
        return null;
    }
    
}
