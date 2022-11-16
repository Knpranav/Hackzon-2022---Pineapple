public class Person {
    int id;
    String name;
    String age;
    String gender;
    float x;
    float y;

    public Person(){

    }

    public Person(String details){
        String[] values = details.split(",");
        createFrom(values);
    }

    private void createFrom(String[] values){
        id = Integer.parseInt(values[0]);
        name = values[1];
        age = values[2];
        gender = values[3];
        x = Float.parseFloat(values[4]);
        y = Float.parseFloat(values[5]);
    }
}
