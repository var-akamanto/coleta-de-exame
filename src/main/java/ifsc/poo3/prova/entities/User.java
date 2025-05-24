package ifsc.poo3.prova.entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class User {
    private String first_name;
    private String last_name;
    private String full_name;
    private char gender;
    private int birth_day;
    private int birth_month;
    private int birth_year;
    private String register_id;
    private final LocalDate now = LocalDate.now();
    private LocalDate birth_date;
    private String birth_date_formatted;

    private String getBirth_date_formatted(LocalDate birth_date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return birth_date.format(formatter);
    }

    public User(String first_name, String last_name, char gender, int birth_day, int birth_month, int birth_year) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.birth_day = birth_day;
        this.birth_month = birth_month;
        this.birth_year = birth_year;
        this.birth_date = LocalDate.of(birth_year, birth_month, birth_day);
        this.birth_date_formatted = getBirth_date_formatted(birth_date);
        this.register_id = generate_id();
    }

    private String generate_id(){
        Random rand = new Random();
        int randomNum = 100000 + rand.nextInt(900000); // número entre 100000 e 999999
        return String.valueOf(randomNum);
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String firstName) {
        this.first_name = firstName;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String lastName) {
        this.last_name = lastName;
    }

    public String getFull_name(){
        return first_name + " " + last_name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public short getAge() {
        Period diff = Period.between(birth_date, now);
        return (short) diff.getYears();
    }

    public String get_id() {
        return register_id;
    }

    public String getLogin_user() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
        String day_of_month = birth_date.format(formatter);
        return first_name + day_of_month;
    }

    public String getLogin_password() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        return birth_date.format(formatter);
    }

    @Override
    public String toString() {
        return "User{\n" +
                "full_name='" + getFull_name() + "'\n" +
                "id='" + register_id + "'\n" +
                "gender=" + getGender() + "\n" +
                "birth_date=" + getBirth_date_formatted(birth_date) + "\n" +
                "age=" + getAge() + "\n" +
                "user='" + getLogin_user() + "'\n" +
                "password='" + getLogin_password() + "'\n" +
                '}';
    }
}
