package ee.sda;


import ee.sda.DB.DatabaseUtil;

public class Main {


    public static void main(String[] args) {


        DatabaseUtil.getSessionFactory();


        VeterinarianDAO veterinarianDAO = new VeterinarianDAO(Veterinarian.class);
        //Veterinarian veterinarian = (Veterinarian) veterinarianDAO.save(veterinarianDAO);
        Veterinarian veterinarian =  new Veterinarian("Kaja", "Bold");
        veterinarian = (Veterinarian) veterinarianDAO.save(veterinarian);
        System.out.println(veterinarian);




    }



}
