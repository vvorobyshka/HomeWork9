package academy.belhard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonIOUtil {
    static void writePersons(List<Person> list1, String FileName){
        try (FileWriter write = new FileWriter(FileName)) {
            for (Person person: list1) {
                write.write(person.toString());
            }
        }
        catch ( IOException e) {
            e.printStackTrace();
        }
    }

    static List<Person> readPersons(String FileName) throws IOException{
        List<Person> list1 = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(FileName))) {
            String s;

            while ((s = reader.readLine()) != null) {
                list1.add(Person.toObject(s));
            }

        }
        catch (EmptySourceFileException e) {
            e.printStackTrace();
        }
        return list1;
    }

}
