package ee.sda;


import ee.sda.dao.PetDAO;
import ee.sda.dao.VeterinarianDAO;
import ee.sda.db.DatabaseUtil;
import ee.sda.entities.Pet;
import ee.sda.entities.Veterinarian;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        DatabaseUtil.init();

        VeterinarianDAO veterinarianDAO = new VeterinarianDAO();

        //veterinarian = veterinarianDAO.save(veterinarian);
        //System.out.println(veterinarian);
        //veterinarianDAO.updateVeterinarian(6,"Ott","Sepp","Tartu","Vaccine specialist","ott.sepp@vet.com","556");

        //create consultation
        /*ConsultationDAO consultationDAO = new ConsultationDAO();
        LocalDate date = LocalDate.now();
        consultationDAO.createConsultation(date,"description",2,2);*/

        //veterinarianDAO.deleteVeterinarian(11);

        //System.out.println(veterinarianDAO.findVeterinarian(2));

        List<Veterinarian> allVeterinarians = veterinarianDAO.findAll();
        for (Veterinarian veterinarian : allVeterinarians) {
            System.out.println(veterinarian);
        }
        

    }


}
