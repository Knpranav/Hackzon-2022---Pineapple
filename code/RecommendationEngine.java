import java.util.ArrayList; 
import java.util.HashMap;
public class RecommendationEngine { 
    public Books canRecommend (Books books, Person person, BookTransactions transactions, HashMap<Integer, Books> hasRead){
    Books recommendable = new Books(); 
    ArrayList<Recommendable> ruleList = new ArrayList<Recommendable>(); 
    ruleList.add(new ReadBeforeRule()); 
    ruleList.add(new AvailabilityRule()); 
    ruleList.add(new MatchingAgeRule()); 
    ruleList.add(new MatchingGenreRule()); 
    ruleList.add(new PrequelSequelRule()); 
    for(Book book : books){
        boolean flag = true; 
        for(Recommendable rule : ruleList){ 
            if(!rule.getRecommend(person, book, transactions, books, hasRead)){
                flag = false; 
                break;
            }
        }
        if(flag)
            recommendable.add(book);
    }
    return recommendable;
}
}