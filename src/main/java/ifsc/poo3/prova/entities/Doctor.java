package ifsc.poo3.prova.entities;

public class Doctor extends User{

    public Doctor(String first_name, String last_name, char gender, int birth_day, int birth_month, int birth_year) {
        super(first_name, last_name, gender, birth_day, birth_month, birth_year);
    }

    private String crm_number;
}