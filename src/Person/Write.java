package Person;

import java.io.FileWriter;

public class Write {
    public static void WritePerson(Person person) throws Exception {
        String filename = person.getLastName() + "txt";
        FileWriter fileWriter = new FileWriter(filename,true);
        fileWriter.write(person.getLastName() + " " + person.getFirstName() + " " + person.getMiddleName()
                + " " + person.getBirthday() + " " + person.getPhoneNumber() + " " + person.getGender());
        fileWriter.close();
    }
}
