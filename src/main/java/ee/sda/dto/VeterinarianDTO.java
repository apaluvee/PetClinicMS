package ee.sda.dto;

import com.google.gson.Gson;
import ee.sda.entities.Veterinarian;

import java.util.HashMap;
import java.util.Map;

public class VeterinarianDTO {

    public int id;
    private String name;
    private String speciality;
    private String email;
    private String phone;

    public VeterinarianDTO(Veterinarian veterinarian) {
        this.name = veterinarian.getFirst_name() + " " + veterinarian.getLast_name();
        this.speciality = veterinarian.getSpeciality();
        this.email = veterinarian.getEmail();
        this.phone = veterinarian.getPhone();

    }

    public VeterinarianDTO() {

    }

    public String getJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
