package ee.sda.dao;

import ee.sda.entities.Pet;

import java.time.LocalDate;
import java.util.ArrayList;


public class PetDAO extends AbstractDAO<Pet, Integer> {

    public PetDAO() {
        super(Pet.class);
    }


    public Pet createPet(String species,String petName, String ownerName, LocalDate dob) {
        return save(new Pet(species, petName, ownerName, dob));
    }

    public Pet updatePet(int id, String species, String petName, String ownerName, LocalDate dob) {
        Pet pet = find(id);
        pet.setSpecies(species);
        pet.setPetName(petName);
        pet.setOwnerName(ownerName);
        pet.setDob(dob);
        update(pet);
        return pet;
    }

    public Pet findPet(int id) {
        Pet pet = find(id);
        return pet;
    }

    public Pet deletePet(int id) {
        Pet pet = find(id);
        delete(pet);
        return pet;
    }

    public ArrayList<Pet> findALLPets() {
        ArrayList<Pet> allPets = findAll();
        return allPets;
    }



}