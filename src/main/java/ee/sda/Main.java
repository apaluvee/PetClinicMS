package ee.sda;


import ee.sda.dao.PetDAO;
import ee.sda.dao.VeterinarianDAO;
import ee.sda.entities.Pet;
import ee.sda.entities.Veterinarian;
import ee.sda.db.DatabaseUtil;

public class Main {


    public static void main(String[] args) {


        DatabaseUtil.init();


        VeterinarianDAO veterinarianDAO = new VeterinarianDAO();
        Veterinarian veterinarian =  new Veterinarian("Kaja", "Bold");

        veterinarian.setEmail("kaja.bold@gmail");
        veterinarian.setAddress("tartu");
        veterinarian = veterinarianDAO.save(veterinarian);
        System.out.println(veterinarian);




    }



}
