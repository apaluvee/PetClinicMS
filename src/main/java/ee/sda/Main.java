package ee.sda;


import ee.sda.dao.PetDAO;
import ee.sda.dao.VeterinarianDAO;
import ee.sda.db.DatabaseUtil;
import ee.sda.entities.Pet;
import ee.sda.entities.Veterinarian;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {


    public static void main(String[] args) {

        DatabaseUtil.init();

        VeterinarianDAO veterinarianDAO = new VeterinarianDAO();
        //veterinarian.setEmail("kaja.bold@gmail");
        //veterinarian.setAddress("tartu");

        //veterinarianDAO.find(1).setEmail("test");
        //veterinarian = veterinarianDAO.save(veterinarian);
        //System.out.println(veterinarian);
        //veterinarianDAO.updateVeterinarian(1,"a","b","c","s","@","555");

        veterinarianDAO.deleteVeterinarian(11);


        //create consultation
        /*ConsultationDAO consultationDAO = new ConsultationDAO();
        LocalDate date = LocalDate.now();
        consultationDAO.createConsultation(date,"description",2,2);*/

    }


}
