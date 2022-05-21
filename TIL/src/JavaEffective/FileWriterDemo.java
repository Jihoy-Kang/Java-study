package JavaEffective;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try{
            String fileName = "codestates.txt";
            FileWriter writer = new FileWriter(fileName);

            String  str = "written!";
            writer.write(str);
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
