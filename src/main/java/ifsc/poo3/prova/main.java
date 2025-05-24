package ifsc.poo3.prova;
import ifsc.poo3.prova.entities.Doctor;
import ifsc.poo3.prova.entities.Exam;
import ifsc.poo3.prova.entities.Hospital;
import ifsc.poo3.prova.entities.User;
import ifsc.poo3.prova.entities.enums.AnalysisType;
import ifsc.poo3.prova.entities.enums.SampleType;
import ifsc.poo3.prova.entities.enums.TargetOrganism;

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


        String doctor_first_name = "Mariana";
        String doctor_last_name = "Silva";
        char doctor_gender = 'F';
        int doctor_birth_day = 12;
        int doctor_birth_month = 3;
        int doctor_birth_year = 1987;
        String doctor_crm_number = "CRM654321";

        Doctor medico = new Doctor(doctor_first_name,doctor_last_name,doctor_gender,doctor_birth_day,doctor_birth_month,doctor_birth_year,doctor_crm_number);

        System.out.println(medico);



        Hospital hospital = new Hospital();

        hospital.setName("Hospital Santa Catarina");
        hospital.setStreet_name("Rua Blumenau");
        hospital.setStreet_number((short) 123);
        hospital.setNeighbourhood("Centro");
        hospital.setCity("Blumenau");
        hospital.setState("SC");
        hospital.setPostal_code("89010-000");
        hospital.setPhone_number("4733221122");

        System.out.println("Hospital: " + hospital.getName());
        System.out.println("Endereço completo: " + hospital.getFull_address());
        System.out.println("Telefone: " + hospital.getPhone_number());


        Exam exame = new Exam(
                5,
                SampleType.FEZES,
                AnalysisType.CULTURA_AEROBIA,
                TargetOrganism.BACTERIA,
                false
        );


        System.out.println(exame);
    }
    }
