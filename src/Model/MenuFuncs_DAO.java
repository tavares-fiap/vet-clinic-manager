package Model;

import java.util.Map;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class MenuFuncs_DAO {

    private Map<String, User> users = new HashMap<>();
    private Map<String, Owner> owners = new HashMap<>();
    private List<String> ownersNamesAndIdentifier = new ArrayList<>(); // para colocar na JComboBox
    private List<String> vetsNamesAndIdentifier = new ArrayList<>(); // para colocar na JComboBox
    private User loggedUser = null;
    private Animal searchedAnimal = null;
    private int userId = 0;
    private int ownerId = 0;
    

    
    public User getLoggedUser() {
        return loggedUser;
    }

    public int getTotalUsers() {
        return users.size();
    }

    public Animal getSearchedAnimal() {
        return searchedAnimal;
    }

    public void setSearchedAnimal(Animal searchedAnimal) {
        this.searchedAnimal = searchedAnimal;
    }
    
    public String[] getOwnersNamesAndIdentifier() {
        return ownersNamesAndIdentifier.toArray(new String[ownersNamesAndIdentifier.size()]);
    }
    
    public String[] getVetsNamesAndIdentifier() {
        return vetsNamesAndIdentifier.toArray(new String[vetsNamesAndIdentifier.size()]);
    }
    
    public String[] getAnimalsNamesByCPF(String cpf){
        return owners.get(cpf).getAnimalsNames();
    }
    
    public Owner getOwner(String cpf){
        return owners.get(cpf);
    }

    public User getVet(String username){
        return users.get(username);
    }
    
    public String extractIdentifier(String nameAndIdentifier) {
        String[] splitedNameAndIdentifier = nameAndIdentifier.split(" ");
        return splitedNameAndIdentifier[splitedNameAndIdentifier.length - 1]; 
    }
    
    public boolean hasRegisteredOwners() {
        return !owners.isEmpty();
    }
    
    private boolean isUsernameTaken(String username) {
        return users.containsKey(username);
    }

    private boolean isCpfRegistered(String cpf) {
        return owners.containsKey(cpf);
    }
    
    
    private boolean isIdTaken(int id) {
        for (String key : users.keySet()) {
            if (users.get(key).getId() == id) {
                return true;
            }
        }
        return false;
    }
    
    private int ensureUniqueId(int id) {
        while (isIdTaken(id)) {
            id++;
            System.out.println("ID: " + id);
        }
        return id;
    }

    public boolean signUp(String name, int age, String password, String username, String userType) {
        userId = users.size();
        if (isUsernameTaken(username) == false) {
            users.put(username, new User(name, age, ensureUniqueId(userId), password, username, userType));
            loggedUser = users.get(username);
            if (userType.equals("Veterinario(a)")) {
                vetsNamesAndIdentifier.add(name + " || " + username);
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean login(String username, String password) {
        if (users.containsKey(username) && users.get(username).getPassword().equals(password)) {
            loggedUser = users.get(username);
            return true;
        } else {
            return false;
        }
    }

    public boolean logout() {
        if (loggedUser != null) {
            loggedUser = null;
            return true;
        } else {
            return false;
        }
    }

    public boolean addNewOwner(String cpf, String name, String phoneNumber) {
        ownerId = owners.size();
        if (isCpfRegistered(cpf) == false) {
            owners.put(cpf, new Owner(name, phoneNumber, ensureUniqueId(ownerId)));
            ownersNamesAndIdentifier.add(name + " || " + cpf);
            return true;
        } else {
            return false;
        }
    }

    public boolean addNewAppointment(Animal animal, String appointmentDate, String appointmentReason, String isTreated, User vet){
        if (isTreated.equals("Sim")) {
            animal.addAppointment(new Appointment(appointmentDate, appointmentReason, true, vet));
            return true;
        } else if (isTreated.equals("Nao")) {
            animal.addAppointment(new Appointment(appointmentDate, appointmentReason, false, vet));
            return true;
        } else {
            return false;
        }
    }
    
    public static void changeScreen(JFrame currentScreen, JFrame nextScreen) {
        currentScreen.dispose();
        nextScreen.setVisible(true);
    }

    public static void exit() {
        String response = JOptionPane.showInputDialog(null, "Tem certeza que deseja encerrar o programa?\n1 - Sim\n2 - Cancelar");
        if (Integer.parseInt(response) == 1) {
            System.exit(0);
        }
    }

}
