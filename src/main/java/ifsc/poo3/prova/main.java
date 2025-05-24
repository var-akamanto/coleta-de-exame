package ifsc.poo3.prova;

import ifsc.poo3.prova.entities.User;

public class main {
    public static void main(String[] args) {
         String first_name = "Pedro";
         String last_name = "Henrique de Alcantara Abrantes";
         char gender = 'M';
         int birth_day = 5;
         int birth_month = 10;
         int birth_year = 2005;
        User paciente = new User(first_name,last_name,gender,birth_day,birth_month,birth_year);
        System.out.println(paciente);

    }
}
