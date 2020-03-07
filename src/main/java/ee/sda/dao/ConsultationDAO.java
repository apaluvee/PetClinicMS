package ee.sda.dao;

import ee.sda.entities.Consultation;
import ee.sda.entities.Pet;
import ee.sda.entities.Veterinarian;

import java.time.LocalDate;
import java.util.ArrayList;

public class ConsultationDAO extends AbstractDAO<Consultation, Integer > {
    public ConsultationDAO() {
        super(Consultation.class);
    }

    public Consultation createConsultation(LocalDate consultDate, String consultDescription, Integer petId, Integer VetId){
        System.out.println("Called");
        PetDAO petDao= new PetDAO();
        Pet pet=petDao.find(petId);
        VeterinarianDAO veterinarianDAO=new VeterinarianDAO();
        Veterinarian veterinarian=veterinarianDAO.find(VetId);
        return save(new Consultation(consultDate,consultDescription,pet,veterinarian));
    }

    public Consultation createConsultation(LocalDate consultDate, String consultDescription, Pet pet, Veterinarian veterinarian) {
        return save(new Consultation(consultDate, consultDescription, pet, veterinarian));
    }

    public Consultation updateConsultation(int consult_id, LocalDate consult_date, String consult_description) {
        Consultation consultation = find(consult_id);
        consultation.setConsultDate(consult_date);
        consultation.setConsultDescription(consult_description);
        update(consultation);
        return consultation;
    }

    public Consultation findConsultation(int consult_id) {
        Consultation consultation = find(consult_id);
        return consultation;
    }

    public Consultation deleteConsultation(int consult_id) {
        Consultation consultation = find(consult_id);
        delete(consultation);
        return consultation;
    }

    public ArrayList<Consultation> findALLConsults() {
        ArrayList<Consultation> allConsults = findAll();
        return allConsults;
    }


}