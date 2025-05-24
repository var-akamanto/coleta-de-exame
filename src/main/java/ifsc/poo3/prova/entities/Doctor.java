package ifsc.poo3.prova.entities;

public class Doctor extends User {

    private String crm_number;

    public Doctor(String first_name, String last_name, char gender, int birth_day, int birth_month, int birth_year, String crm_number) {
        super(first_name, last_name, gender, birth_day, birth_month, birth_year);
        this.crm_number = crm_number;
    }

    public String getCrm_number() {
        return crm_number;
    }

    public void setCrm_number(String crm_number) {
        this.crm_number = crm_number;
    }

    @Override
    public String toString() {
        return "Doctor{\n" +
                "crm_number='" + crm_number + "'\n" +
                super.toString() + "\n" +
                '}';
    }
}
