package practice_projects.read_from_textfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read_from_file {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("/Users/Admin/OneDrive/Bilder/Desktop/file.txt");

        Scanner scan = new Scanner(file);

        System.out.println(scan.nextLine());
    }
}
