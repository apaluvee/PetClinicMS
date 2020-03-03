package ee.sda;


import ee.sda.dao.ConsultationDAO;
import ee.sda.dao.PetDAO;
import ee.sda.dao.VaccineDAO;
import ee.sda.dao.VeterinarianDAO;
import ee.sda.db.DatabaseUtil;
import ee.sda.entities.Consultation;
import ee.sda.entities.Pet;
import ee.sda.entities.Vaccine;
import ee.sda.entities.Veterinarian;

import javax.xml.bind.SchemaOutputResolver;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {


        DatabaseUtil.init();



        /**   ALL DAOs  **/

        ConsultationDAO consultationDAO = new ConsultationDAO();

        PetDAO petDAO = new PetDAO();

        VaccineDAO vaccineDAO = new VaccineDAO();

        VeterinarianDAO veterinarianDAO = new VeterinarianDAO();


        /**   CONSULTATION  **/
        //CREATE
       LocalDate localDateConsult = LocalDate.of(2020, 4, 13);
        /* //Consultation consultation = consultationDAO.createConsultation(localDateConsult, "This parrot needs a flu vaccine", petDAO.find(1),veterinarianDAO.find(1));
        Consultation consultation1 = consultationDAO.createConsultation(localDateConsult.plus(1, ChronoUnit.MONTHS).plus(3, ChronoUnit.DAYS), "Flu vaccine for your Dog", petDAO.find(1),veterinarianDAO.find(1));
        Consultation consultation2 = consultationDAO.createConsultation(localDateConsult.plus(2, ChronoUnit.MONTHS).plus(1, ChronoUnit.DAYS), "Leach vaccine for this Dog", petDAO.find(1),veterinarianDAO.find(1));
        //System.out.println(consultation);
        System.out.println(consultation1);
        System.out.println(consultation2);*/


        //READ
        /*Consultation findConsultation = consultationDAO.find(3);
        System.out.println(findConsultation);

        ArrayList<Consultation> findConsultationS = consultationDAO.findALLConsults();
        System.out.println(findConsultationS.size());
        System.out.println(findConsultationS);*/


        //UPDATE
        /*Consultation consultUpdate  = consultationDAO.updateConsultation(6,localDateConsult,"Reduce this dogs ears...");
        System.out.println(consultUpdate);*/


        //DELETE
       /* Consultation consultDelete  = consultationDAO.deleteConsultation(11);
        System.out.println(consultDelete + " was deleted successfully!");*/



        /**   PET  **/
        //CREATE
        /*LocalDate localDate = LocalDate.of(2012, 11, 11);
        Pet pet = petDAO.createPet("Afador", "Bingo", "Kaia", localDate);
        System.out.println(pet);
        Pet pet1 = petDAO.createPet("Barbet", "Barby", "James",
                localDate.plus(2, ChronoUnit.YEARS).minus(2, ChronoUnit.MONTHS).plus(5, ChronoUnit.DAYS));
        System.out.println(pet1);
        Pet pet2 = petDAO.createPet("Cavador", "Woofy", "Bianca",
                localDate.plus(4, ChronoUnit.YEARS).minus(4, ChronoUnit.MONTHS).plus(10, ChronoUnit.DAYS));
        System.out.println(pet2);
        Pet pet3 = petDAO.createPet("Daniff", "Snoopy", "Kane",
                localDate.plus(3, ChronoUnit.YEARS).minus(6, ChronoUnit.MONTHS).plus(11, ChronoUnit.DAYS));
        System.out.println(pet3);*/

        /*LocalDate localDate = LocalDate.of(2013, 05, 22);
        Pet pet = petDAO.createPet("Labrador", "Fuzzy", "Leo", localDate);
        System.out.println(pet);*/


        //READ
       /* Pet pet = petDAO.findPet(1);
        System.out.println(pet);*/

        /*ArrayList<Pet> petALL = petDAO.findALLPets();
        System.out.println(petALL.size());
        System.out.println(petALL);*/


        //UPDATE
       /* Pet petUpdate = petDAO.updatePet(1,"Afador", "Puffy", "Kaia", LocalDate.of(2012, 11, 11));
        System.out.println(petUpdate);*/

       /*Pet petUpdate = petDAO.updatePet(14,"Chi Chi", "Chikky", "Mary", LocalDate.of(2020, 01, 01));
        System.out.println(petUpdate);*/


        //DELETE
        /*Pet deletePet = petDAO.deletePet(5);
        System.out.println(deletePet + " was deleted successfully!");*/



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

    }



}