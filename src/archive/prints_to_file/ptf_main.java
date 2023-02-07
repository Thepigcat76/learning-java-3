package archive.prints_to_file;

import java.io.*;

public class ptf_main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
            prints_to_file p1 = new prints_to_file("Jerry", 35);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Person.txt"));
            out.writeObject(p1);

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Person.txt"));
        }
    }
