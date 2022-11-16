import java.util.HashMap;

public class AvailabilityRule implements Recommendable {

    @Override
    public boolean getRecommend(Person person, Book book, BookTransactions transactions, Books books,
            HashMap<Integer, Books> hasRead) {
        for(BookTransaction transaction : transactions){
            if(book.index == transaction.bookID && transaction.returnDate == null){
                return false;
            }
        }
        return true;
    }
    
}
