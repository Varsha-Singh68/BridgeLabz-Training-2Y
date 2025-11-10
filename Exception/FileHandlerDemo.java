package exception_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class FileHandler {
    public FileHandler(String fileName) throws IOException {
        File file = new File(fileName);

        if (!file.exists()) {
            throw new IOException("File not found: " + fileName);
        } else {
            FileInputStream fis = new FileInputStream(file);
            System.out.println("File opened successfully: " + fileName);
            fis.close();
        }
    }
}

public class FileHandlerDemo {
    public static void main(String[] args) {
        try {
            FileHandler handler = new FileHandler("non_existing_file.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("File handling process completed.");
        }
    }
}

