package FileManagement;

import java.io.FileWriter;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.nio.file.StandardOpenOption;

public class Write {
    public Write(String msg) {
        try {
            FileWriter myWriter = new FileWriter(Create.getPath(), true);
            myWriter.write(msg+"\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Um erro ocorreu.");
            e.printStackTrace();
        }
    }
}

