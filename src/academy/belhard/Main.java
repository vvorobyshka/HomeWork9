package academy.belhard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {


        Person per1 = new Person("Anna", "Vorobyova", new Address("Minsk", "Bedy", 34));
        Person per2 = new Person("Nikita", "Kardymon", new Address("Minsk", "Pushkina", 23));
        Person per3 = new Person("Sasha", "Makarenko", new Address("Grodno", "Poirt", 19));



        List<Person> list = new ArrayList<>();
        list.add(per1);
        list.add(per2);
        list.add(per3);
        PersonIOUtil.writePersons(list, "FileName");

        List<Person> list2 = PersonIOUtil.readPersons("FileName");
        for (Person p : list2
             ) {
            System.out.println(p.toString());
        }

    }
}
