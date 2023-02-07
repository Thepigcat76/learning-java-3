package practice_projects.print_to_file_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class print_to_file_2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("test.txt");

        FileWriter fw = new FileWriter(file1);

        PrintWriter pw = new PrintWriter(fw);

        pw.println("Line 1");

        pw.close();
    }
}
