import java.util.HashMap;

public class MatchingAgeRule implements Recommendable{

    @Override
    public boolean getRecommend(Person person, Book book, BookTransactions transactions, Books books,
            HashMap<Integer, Books> hasRead) {
        if(book.ageGroup.equals(person.age)){
            return true;
        }
        return false;
    }
    
}
