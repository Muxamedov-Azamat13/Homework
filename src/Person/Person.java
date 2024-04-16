package Person;

import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthday;
    private long phoneNumber;
    private char gender;

    public Person(String lastName, String firstName, String middleName, LocalDate birthday, long phoneNumber, char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthday=" + birthday +
                ", phoneNumber=" + phoneNumber +
                ", gender=" + gender +
                '}';
    }
}
