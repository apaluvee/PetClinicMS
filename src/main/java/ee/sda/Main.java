package ee.sda;


import ee.sda.DB.DatabaseUtil;

public class Main {

    public static void main(String[] args) {


        DatabaseUtil.getSessionFactory();


        VeterinarianDAO veterinarianDAO = new VeterinarianDAO(Veterinarian.class);
        //Veterinarian veterinarian = (Veterinarian) veterinarianDAO.save(veterinarianDAO);
        Veterinarian veterinarian =  veterinarianDAO.save(Veterinarian);
        veterinarian.setFirst_name("Kaja");
        veterinarian.setLast_name("Klass");
        veterinarian = VeterinarianDAO.save(veterinarian);
        System.out.println(veterinarian);




    }

}
