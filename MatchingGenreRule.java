import java.util.ArrayList;
import java.util.HashMap;

public class MatchingGenreRule implements Recommendable {

    @Override
    public boolean getRecommend(Person person, Book book, BookTransactions transactions, Books books,
            HashMap<Integer, Books> hasRead) {
        ArrayList<String> readGenre = new ArrayList<String>();
        for(Book readBook : hasRead.get(person.id)){
            readGenre.add(readBook.genre);
        }
        for(String genreRead : readGenre){
            if(book.genre.equals(genreRead)){
                return true;
            }
        }
        return false;
    }
    
}
