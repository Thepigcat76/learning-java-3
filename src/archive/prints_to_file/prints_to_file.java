package archive.prints_to_file;

import java.io.Serializable;

public class prints_to_file implements Serializable {
    private String name;
    private int age;

    public prints_to_file(String aName, int anAge) {
        name = aName;
        age = anAge;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
