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

        bookList = mainRecommend.parsing("books.csv");
        peopleList = mainRecommend.parsing("users.csv");
        transactionList = mainRecommend.parsing("transactions.csv");
        Books books = mainRecommend.generateBooks(bookList);
        People people = mainRecommend.generatePeople(peopleList);
        BookTransactions transactions = mainRecommend.generateTransaction(transactionList);
        HashMap<Integer, Books> hasRead = mainRecommend.generateHasRead(transactions, books);
        People peopleToRecommend = new People();

        while(true){
            System.out.println("Enter a valid user ID: (-1 to end users)");
            userID = sc.nextInt();
            if(userID == -1)
                break;
            else if(people.getByID(userID) == null)
                continue;
            person = people.getByID(userID);
            recommenededBooks = recommender.canRecommend(books, person, transactions, hasRead);
            for(Book b : recommenededBooks){
                b.updateCount();
            }
            peopleToRecommend.add(person);
        }

        OrderPeople order = new OrderPeople();
        peopleToRecommend = order.sortOrder(peopleToRecommend);
        System.out.println("The order to visit from your location is: ");
        for(Person p : peopleToRecommend){
            System.out.println(p.id + " " + p.name + " " + p.x + " " + p.y);
        }

        System.out.println();
        System.out.println();

        System.out.println("The books you will need to carry are: ");
        for(Book b : books){
            if(b.count == 1)
                System.out.println("1 copy of " + b.name);
            else if(b.count > 1)
                System.out.println(b.count + " copies of " + b.name);
        }
        
        sc.close();

    }
}
