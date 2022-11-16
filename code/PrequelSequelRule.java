import java.util.HashMap;

public class PrequelSequelRule implements Recommendable{

    @Override
    public boolean getRecommend(Person person, Book book, BookTransactions transactions, Books books,
            HashMap<Integer, Books> hasRead) {
        if(book.prequel == -1){
            return true;
        }
        for(Book readBook : hasRead.get(person.id)){
            if(book.prequel == readBook.index){
                return true;
            }
        }
        return false;
    }
    
}
