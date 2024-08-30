package Model;

import java.util.HashMap;
import java.util.Map;

public class Owner {

    private int id;
    private String name;
    private String phoneNumber;
    private Map<String, Animal> animals = new HashMap<>();

    public Owner(String name, String phoneNumber, int id) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    public void addNewAnimal(String name, int age, String animalSpecies, String details) {
        animals.put(name, new Animal(name, age, animalSpecies, details));
    }

    public String[] getAnimalsNames() {
        return animals.keySet().toArray(new String[animals.keySet().size()]);
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getId() {
        return id;
    }
    
    public Animal getAnimal(String animalName){
        return animals.get(animalName);
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.name + "\nID: " + this.id + "\nTelefone: " + this.phoneNumber + "\nAnimais: " + this.animals.toString();
    }

}
