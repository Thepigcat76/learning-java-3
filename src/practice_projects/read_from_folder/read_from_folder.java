package practice_projects.read_from_folder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class read_from_folder {


        // main method
        public static void main(String[] args) throws IOException {

            // create a file object
            String folderPath = "C:\\Users\\Admin\\curseforge\\minecraft\\Instances\\Modpack des Jahrhunderts#\\mods";

            File folder = new File(folderPath);

            File[] files = folder.listFiles();

            FileWriter fw = new FileWriter("C:\\Users\\Admin\\OneDrive\\Bilder\\Desktop\\modlist.txt");

            BufferedWriter bw = new BufferedWriter(fw);

            for(File file:files) {
                if(file.isFile()) {
                    bw.write("File - " + file.getName()+"; ");
                }
            }
            bw.close();
        }
    }

