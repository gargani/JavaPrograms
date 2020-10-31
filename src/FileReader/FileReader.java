package FileReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {

    public static void main(String[] args){

        String []name1 = {"Bob", "Sam", "Ani"};
        String []name2 = {"Bob", "Ram", "Ani"};

        Integer[] num1 = {1,2,3,5};
        Integer[] num2 = {5,4,3,2};

    }
    public static void ReadTextFile() {
        File file = new File("/Users/anirudhgarg/Desktop/Anirudh.txt");

        try
        {
            file.createNewFile();
            FileInputStream inputStream = new FileInputStream(file);
            String data = inputStream.toString();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch(Exception exe){
            exe.printStackTrace();
        }
    }
}
