package ee.sda;

import ee.sda.dao.VaccineDAO;
import ee.sda.dao.VeterinarianDAO;
import ee.sda.db.DatabaseUtil;
import ee.sda.entities.Pet;
import ee.sda.entities.Veterinarian;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {


    public static void main(String[] args) {


        DatabaseUtil.init();

        VaccineDAO vaccineDAO=new VaccineDAO();
        //vaccineDAO.CreateVaccine("Flea Killer", "flea vaccine for dogs");
        vaccineDAO.CreateVaccine("Rabie Cure"," rabies vaccine for dogs");
        vaccineDAO.CreateVaccine("Flea Slayer", "flea vaccine for cats");
        System.out.println(vaccineDAO.FindVaccine());
    }


}
