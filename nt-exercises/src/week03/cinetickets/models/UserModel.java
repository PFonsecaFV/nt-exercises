package week03.cinetickets.models;

public class UserModel {
    private String name;
    private String role;
    private int age;
    private String userName;
    private String password;

    public UserModel(String name, String role, int age, String userName, String password) {
        this.name = name;
        this.role = role;
        this.age = age;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "Nome Completo: '" + name + '\'' +
                "Tipo de Usuário: '" + role + '\'' +
                "Idade: '" + age + '\'' +
                "Usuário: '" + userName + '\'' +
                "Senha: '" + password + '\'' +
                '}';
    }

    public String getRole() {
        return role;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
