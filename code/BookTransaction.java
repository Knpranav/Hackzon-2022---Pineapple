import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookTransaction {
    int bookID;
    int personID;
    Date issueDate;
    Date returnDate;
    Date plannedReturnDate;

    public BookTransaction(){
        
    }
    public BookTransaction(String details) throws ParseException{
        String[] values = details.split(",");
        createFrom(values);
    }

    private void createFrom(String[] values) throws ParseException{
        bookID = Integer.parseInt(values[1]);
        personID = Integer.parseInt(values[0]);
        issueDate = stringToDate(values[2]);
        returnDate = stringToDate(values[3]);
        if(values.length > 4)
            plannedReturnDate = stringToDate(values[4]);
    }

    public Date stringToDate(String dateString) throws ParseException{
        if(dateString.isEmpty())
            return null;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse(dateString);
        return date;
    }
}
