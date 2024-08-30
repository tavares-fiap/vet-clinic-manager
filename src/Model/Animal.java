package Model;

import java.util.Map;
import java.util.HashMap;

public class Animal {

    private Map<Integer, Appointment> appointments = new HashMap<>();
    private String name;
    private int age;
    private String animalSpecies;
    private String details;
    private int appointmentId; // nao pode apagar consulta

    public Animal(String name, int age, String animalSpecies, String details) {
        this.name = name;
        this.age = age;
        this.animalSpecies = animalSpecies;
        this.details = details;
    }

    public String getAnimalSpecies() {
        return animalSpecies;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDetails() {
        return details;
    }

    public Map<Integer, Appointment> getAppointments() {
        return appointments;
    }

    public boolean addAppointment(Appointment appointment) {
        appointmentId = appointments.keySet().size();
        appointments.put(appointmentId, appointment);
        return true;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + "\nIdade: " + this.age + "\nEspécie: " + this.animalSpecies + "\nFicha: " + this.details;
    }

}
