package ee.sda.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "veterinarian")

public class Veterinarian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vet_id")
    private int id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "address")
    private String address;

    @Column(name = "speciality")
    private String speciality;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @OneToMany
    @JoinColumn(name = "consult_id")
    // @JoinColumn(name = "vet_id")
    private List<Consultation> consultations;

    public Veterinarian() {
    }

    public Veterinarian(String first_name, String last_name, String address, String speciality, String email, String phone) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.speciality = speciality;
        this.email = email;
        this.phone = phone;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Consultation> getConsultations() {
        return consultations;
    }

    public void setConsultations(List<Consultation> consultations) {
        this.consultations = consultations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veterinarian that = (Veterinarian) o;
        return id == that.id &&
                Objects.equals(first_name, that.first_name) &&
                Objects.equals(last_name, that.last_name) &&
                Objects.equals(address, that.address) &&
                Objects.equals(speciality, that.speciality) &&
                Objects.equals(email, that.email) &&
                Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, address, speciality, email, phone);
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", address='" + address + '\'' +
                ", speciality='" + speciality + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}