package Mechanic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ReaderFile {

    public List<String> reader(String path) {
        List<String> name = new ArrayList<>();
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            while (reader1.ready()) {
                name.add(reader1.readLine());
            }
            reader1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return name;
    }


}
