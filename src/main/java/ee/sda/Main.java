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
       /* Veterinarian veterinarian = new Veterinarian("Kaja", "Bold");

        veterinarian.setEmail("kaja.bold@gmail");
        veterinarian.setAddress("tartu");
        veterinarian = veterinarianDAO.save(veterinarian);
        System.out.println(veterinarian);*/


       //CREATE
        PetDAO petDAO = new PetDAO();
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
        /*PetDAO petDAO = new PetDAO();
        Pet pet = petDAO.findPet(1);
        System.out.println(pet);*/




        //UPDATE
       /* Pet petUpdate = petDAO.updatePet(1,"Afador", "Puffy", "Kaia", LocalDate.of(2012, 11, 11));
        System.out.println(petUpdate);*/

       Pet petUpdate = petDAO.updatePet(14,"Chi Chi", "Chikky", "Mary", LocalDate.of(2020, 01, 01));
        System.out.println(petUpdate);

        //DELETE
        //Pet deletePet = petDAO.deletePet(5);



    }



}
