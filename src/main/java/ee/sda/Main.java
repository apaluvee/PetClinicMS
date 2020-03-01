package ee.sda;


import ee.sda.DAO.VeterinarianDAO;
import ee.sda.Entities.Veterinarian;
import ee.sda.db.DatabaseUtil;

public class Main {


    public static void main(String[] args) {


        DatabaseUtil.getSessionFactory();


        VeterinarianDAO veterinarianDAO = new VeterinarianDAO();
        Veterinarian veterinarian =  new Veterinarian("Kaja", "Bold");
        veterinarian = veterinarianDAO.save(veterinarian);
        System.out.println(veterinarian);




    }



}
