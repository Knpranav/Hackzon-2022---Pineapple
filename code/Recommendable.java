import java.util.HashMap;

public interface Recommendable {
    boolean getRecommend(Person person, Book book, BookTransactions transactions, Books books, HashMap<Integer, Books> hasRead);
}
