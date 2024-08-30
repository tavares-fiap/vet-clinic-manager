package Model;

public class User {

    private String name;
    private int age;
    private int id;
    private String password;
    private String username;
    private String userType;

    public User(String name, int age, int id, String password, String username, String userType) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.password = password;
        this.username = username;
        this.userType = userType;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "\nNome: " + this.name + "\nFuncao: " + this.userType + "Username: " + this.username;
    }
}
