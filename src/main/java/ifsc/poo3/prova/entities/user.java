package ifsc.poo3.prova.entities;


import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class user {
    private String first_name;
    private String last_name;
    private String full_name;
    private char gender;
    private short age;
    private int birth_day;
    private int birth_month;
    private int birth_year;
    private String register_id;
    private String login_user;
    private String login_password;


    LocalDate now = LocalDate.now();

    public String getFirst_name() {
        return name;
    }

    public void setFirst_name(String firstName) {
        this.name = name;
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
        LocalDate birth_date = LocalDate.of(birth_year,birth_month,birth_day);
        Period diff = Period.between(birth_date,now);
        int age = diff.getYears();

    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getRegister_id() {
        return register_id;
    }

    public void setRegister_id(String register_id) {
        this.register_id = register_id;
    }

    public String getLogin_user() {
        return login_user;
    }

    public void setLogin_user(String login_user) {
        this.login_user = login_user;
    }

    public String getLogin_password() {
        return login_password;
    }

    public void setLogin_password(String login_password) {
        this.login_password = login_password;
    }
}


