import java.util.HashMap;

public class ReadBeforeRule implements Recommendable{

    @Override
    public boolean getRecommend(Person person, Book book, BookTransactions transactions, Books books, HashMap<Integer, Books> hasRead) {
        for(BookTransaction transaction : transactions){
            if(person.id == transaction.personID && book.index == transaction.bookID){
                return false;
            }
        }
        return true;
    }
    
}
