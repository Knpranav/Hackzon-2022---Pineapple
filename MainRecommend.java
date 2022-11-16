import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainRecommend {
    private ArrayList<String> parsing(String filename){
        CsvParser parser = new CsvParser();
        return parser.parse(filename);
    }

    private HashMap<Integer, Books> generateHasRead(BookTransactions transactions, Books books){
        HashMap<Integer, Books> hasRead = new HashMap<Integer, Books>();
        for(BookTransaction transaction : transactions){
            if(hasRead.containsKey(transaction.personID)){
                hasRead.get(transaction.personID).add(books.getByID(transaction.bookID));
            }
            else{
                Books readBooks = new Books();
                readBooks.add(books.getByID(transaction.bookID));
                hasRead.put(transaction.personID, readBooks);
            }
        }
        return hasRead;
    }

    private Books generateBooks(ArrayList<String> bookList){
        Books books = new Books();
        for(String book : bookList){
            books.add(new Book(book));
        }
        return books;
    }

    private People generatePeople(ArrayList<String> peopleList) throws ParseException{
        People people = new People();
        for(String person: peopleList){
            people.add(new Person(person));
        }
        return people;

    }

    private BookTransactions generateTransaction(ArrayList<String> transactionList) throws ParseException{
        BookTransactions transactions = new BookTransactions();
        for(String transaction : transactionList){
            transactions.add(new BookTransaction(transaction));
        }
        return transactions;
    }

    public static void main(String[] args) throws ParseException{
        MainRecommend mainRecommend = new MainRecommend();
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> bookList;
        ArrayList<String> peopleList;
        ArrayList<String> transactionList;
        Books recommenededBooks;
        Person person;
        RecommendationEngine recommender = new RecommendationEngine();
        int userID = -1;
        HashMap<Integer, Books> hasRecommneded = new HashMap<Integer, Books>();

        bookList = mainRecommend.parsing("books.csv");
        peopleList = mainRecommend.parsing("users.csv");
        transactionList = mainRecommend.parsing("transactions.csv");
        Books books = mainRecommend.generateBooks(bookList);
        People people = mainRecommend.generatePeople(peopleList);
        BookTransactions transactions = mainRecommend.generateTransaction(transactionList);
        HashMap<Integer, Books> hasRead = mainRecommend.generateHasRead(transactions, books);
        People peopleToRecommend = new People();

        while(people.getByID(userID) == null){
            System.out.println("Enter a valid user ID: ");
            userID = sc.nextInt();
        }

        person = people.getByID(userID);
        recommenededBooks = recommender.canRecommend(books, person, transactions, hasRead);
        hasRecommneded.put(person.id, recommenededBooks);
        peopleToRecommend.add(person);

        System.out.println("The recommendation engine has generated the following books to recommend: ");
        for(Book book : recommenededBooks){
            System.out.println(book.name);
        }
        sc.close();

    }
}
