package ifsc.poo3.prova.entities;


import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class user {
    private String first_name;
    private String last_name;
    private String full_name;
    private char gender;
    private int birth_day;
    private int birth_month;
    private int birth_year;
    private String register_id;
    private String login_user;
    private String login_password;


    LocalDate now = LocalDate.now();
    LocalDate birth_date = LocalDate.of(birth_year,birth_month,birth_day);

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
        return register_id;
    }

    public void setRegister_id(String register_id) {
        this.register_id = register_id;
    }

    public String getLogin_user() {
        login_user = first_name+birth_date.getDayOfYear();
        return login_user;
    }

    public String getLogin_password() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        login_password = birth_date.format(formatter);
        return login_password;
    }
    }


