package Person;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.zip.DataFormatException;


public class Input {
    public static Person PersonInput() throws Exception {

            System.out.println("Введите данные (Фамилия Имя Отчество дата_рождения номер_телефона пол):");
            String scanner = new Scanner(System.in).nextLine();
            String[] array = scanner.split(" ");

            if (array.length != 6) {
                throw new DataFormatException("Неверное количество данных!");
            }

            String lastName = array[0];
            String firstName = array[1];
            String middleName = array[2];

            LocalDate birthday;
            try {
                birthday = LocalDate.parse(array[3], java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            } catch (RuntimeException e){
                throw new DataFormatException("Неверный формат даты рождения!");
            }

            long phoneNumber;
            try {
                phoneNumber = Long.parseLong(array[4]);
            } catch (RuntimeException e){
                throw new DataFormatException("Неверный формат номера телефона!");
            }

            String gender = array[5];
            if (!gender.equals("f") && !gender.equals("m")) {
                throw new DataFormatException("Неверный формат пола!");
            }

            return new Person(lastName,firstName,middleName,birthday,phoneNumber,gender.charAt(0));
    }



}
