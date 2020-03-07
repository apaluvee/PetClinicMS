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



<<<<<<< HEAD
=======
        /**   VACCINE  **/
        //CREATE
        /*Vaccine vaccine = vaccineDAO.createVaccine("Cough killer","Stop cough in animals");
        Vaccine vaccine1 = vaccineDAO.createVaccine("Eyes cleaner","Cleans the eyes of animals");
        Vaccine vaccine2 = vaccineDAO.createVaccine("Leech stopper","Kills leeches in animals");
        Vaccine vaccine3 = vaccineDAO.createVaccine("Fur retainer","Make the furs grow in animals");
        System.out.println(vaccine);
        System.out.println(vaccine1);
        System.out.println(vaccine2);
        System.out.println(vaccine3);*/


        //READ
        /*Vaccine vaccineReader = vaccineDAO.findVaccine(3);
        System.out.println(vaccineReader);

        ArrayList<Vaccine> vaccinesALL = vaccineDAO.findALLVaccines();
        System.out.println(vaccinesALL);
        System.out.println(vaccinesALL.size());*/


        //UPDATE
        /*Vaccine vaccineUpdater = vaccineDAO.updateVaccine(7,"Fur retainer","Makes furs grow well in animals");
        System.out.println(vaccineUpdater);*/


        //DELETE
        /*Vaccine vaccineDeleter = vaccineDAO.deleteVaccine(5);
        System.out.println(vaccineDeleter + " was deleted successfully!");*/



        /**   VETERINANIAN  **/
        //CREATE
        /*Veterinarian veterinarianCreater = veterinarianDAO.createVet("Kersti","Ilves","Tallinn", "Surgery","ki@email.go", "11223455");
        Veterinarian veterinarianCreater1 = veterinarianDAO.createVet("Ratas","Kallas","Saaremaa", "Bone Specialist","rkallas@email.go", "23224567");
        System.out.println(veterinarianCreater);
        System.out.println(veterinarianCreater1);*/


        //READ
        /*Veterinarian veterinarianFinder = veterinarianDAO.findVet(5);
        System.out.println(veterinarianFinder);

        ArrayList<Veterinarian> veterinariansALL = veterinarianDAO.findALLVets();
        System.out.println(veterinariansALL);
        System.out.println(veterinariansALL.size());*/


        //UPDATE
        Veterinarian veterinarianUpdater = veterinarianDAO.updateVet(5,"Kaja","Bold", "Tartu","Cardiology", "kaja.bold@email.go","99772210");
        System.out.println(veterinarianUpdater);


        //DELETE
        /*Veterinarian veterinarianUpdater = veterinarianDAO.deleteVaccine(5);
        System.out.println(veterinarianUpdater + " was deleted successfully!");*/




       DatabaseUtil.shutdown();

>>>>>>> john
    }

}
