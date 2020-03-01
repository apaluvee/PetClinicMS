package ee.sda.dao;

import ee.sda.entities.Consultation;
import ee.sda.entities.Pet;
import ee.sda.entities.Veterinarian;

import java.time.LocalDate;

public class ConsultationDAO extends AbstractDAO<Consultation, Integer > {
    public ConsultationDAO() {
        super(Consultation.class);
    }

    public Consultation createConsultation(LocalDate consultDate, String consultDescription, Integer petId, Integer VetId){
        PetDAO petDao= new PetDAO();
        Pet pet=petDao.find(petId);
        VeterinarianDAO veterinarianDAO=new VeterinarianDAO();
        Veterinarian veterinarian=veterinarianDAO.find(VetId);
        return save(new Consultation(consultDate,consultDescription,pet,veterinarian));
    }


}
