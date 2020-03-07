package ee.sda.Service;

public class VaccineService {

    private int VaccineId;
    private String VaccineName, VaccineDescription;

    public VaccineService(int vaccineId, String vaccineName, String vaccineDescription) {
        VaccineId = vaccineId;
        VaccineName = vaccineName;
        VaccineDescription = vaccineDescription;
    }

}
