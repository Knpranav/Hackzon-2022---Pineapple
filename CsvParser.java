import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvParser implements Parser{
    @Override
    public ArrayList<String> parse(String filename) {
        ArrayList<String> lineWise = new ArrayList<String>();
        String readString;
        BufferedReader bufferedReader = null;
        try{
            bufferedReader = new BufferedReader(new FileReader(filename));
            bufferedReader.readLine();
            while((readString = bufferedReader.readLine()) != null){
                lineWise.add(readString);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        finally{
            if(bufferedReader != null){
                try{
                    bufferedReader.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        return lineWise;
    }
    
}
