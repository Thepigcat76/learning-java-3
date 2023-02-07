package practice_projects.programming_language;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class programming_language {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/Admin/OneDrive/Bilder/Desktop/test.txt");
        String b = "";
        String a = "pwint"+"uwu"+b+"uwu"+"owo";
        Scanner scan = new Scanner(file);
        if (scan.nextLine().equals("pwint uwu")) {
            System.out.println(scan.nextLine());
        }
    }
}
