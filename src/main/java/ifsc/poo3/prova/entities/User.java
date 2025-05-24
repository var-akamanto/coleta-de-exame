package ifsc.poo3.prova.entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import static java.time.LocalDate.of;

public class User {
    private String first_name;
    private String last_name;
    private String full_name;
    private char gender;
    private int birth_day;
    private int birth_month;
    private int birth_year;
    private String register_id;
    private LocalDate now;
    private LocalDate birth_date;



    public User(String first_name, String last_name, char gender, int birth_day, int birth_month, int birth_year) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.birth_day = birth_day;
        this.birth_month = birth_month;
        this.birth_year = birth_year;
        this.now = LocalDate.now();
        this.birth_date = LocalDate.of(birth_year,birth_month,birth_day);
    }


    private String generate_id(String register_id){
        Random rand = new Random();
        int randomNum = 100000 + rand.nextInt(900000); // número entre 100000 e 999999
        this.register_id = String.valueOf(randomNum);
        return this.register_id;
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

    public void setLast_name(String LastName) {
        this.last_name = last_name;
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
        Period diff = Period.between(birth_date,now);
        return (short) diff.getYears();

    }

    public String getRegister_id() {
        return (register_id);
    }

    public String getLogin_user() {
        return first_name + birth_date.getDayOfYear();
    }

    public String getLogin_password() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        return birth_date.format(formatter);
    }

    @Override
    public String toString() {
        return "User{" +
                "full_name='" + getFull_name() + '\'' +
                "id='" + register_id + '\'' +
                ", gender=" + getGender() +
                ", birth_date=" + birth_date +
                ", age=" + getAge() +
                ", register_id='" + register_id + '\'' +
                "user='" + getLogin_user() + '\'' +
                "password='" + getLogin_password() + '\'' +
                '}';
    }
}


