public class Book{
    int index;
    String name;
    String author;
    String language;
    String genre;
    int prequel;
    int sequel;
    String ageGroup;
    int count;

    public Book(String details){
        String[] values = details.split(",");
        createFrom(values);
    }

    public void updateCount(){
        count++;
    }

    private void createFrom(String[] values){
        index = Integer.parseInt(values[0]);
        name = values[1];
        author = values[2];
        language = values[3];
        genre = values[4];
        if(!values[5].equals(""))
            prequel = Integer.parseInt(values[5]);
        else
            prequel = -1;
        ageGroup = values[7];
        count = 0;
    }
}