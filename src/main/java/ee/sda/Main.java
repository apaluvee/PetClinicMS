package ee.sda;


import ee.sda.DB.DatabaseUtil;

public class Main {

    public static void main(String[] args) {


        DatabaseUtil.getSessionFactory();


        VeterinarianDAO veterinarianDAO = new VeterinarianDAO();

       /* Job job = jobDAO.find(1);
        System.out.println(job);

        Job newJob = new Job();
        newJob.setTitle("New Job with hibernate");*/

    }

}
