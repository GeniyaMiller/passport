package passport;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Passport {
    private String name;
    private String surname;
    private String patronymic;
    private String passportNumber;
    private LocalDate birthday;


    public Passport(String name, String surname, String patronymic, String passportNumber, LocalDate birthday) {
        if (name != null || !name.isEmpty() || !name.isBlank()){
            this.name = name;
        } else {
            throw new IllegalArgumentException("Необходимо указать имя!");
        }
        if (surname != null || !surname.isEmpty() || !surname.isBlank()){
            this.surname = surname;
        } else {
            throw new IllegalArgumentException("Необходимо указать фамилию!");
        }
        if(patronymic!= null || !patronymic.isEmpty()) {
            this.patronymic = patronymic;
        } else {
            System.out.println("Отчество отсутствует");
        }
        if (passportNumber != null || !passportNumber.isEmpty()) {
            this.passportNumber = passportNumber;
        } else {
            throw new IllegalArgumentException("Необходимо указать номер паспорта!");
        }
        this.birthday = birthday;

    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(name, passport.name) && Objects.equals(surname, passport.surname) && Objects.equals(patronymic, passport.patronymic) && Objects.equals(passportNumber, passport.passportNumber) && Objects.equals(birthday, passport.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, passportNumber, birthday);
    }

    @Override
    public String toString() {
        return "Пасспортные данные: " +
                "Имя " + name +
                ", фамилия " + surname +
                ", отчество " + patronymic +
                ", номер паспорта " + passportNumber +
                ", дата рождения " + birthday;
    }
}
