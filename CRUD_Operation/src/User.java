public class User {
    private int id;
    private String name;
    private int age;
    private String email;
    private String password;

    public User(int _id, String _name, int _age, String _email, String _password) {
        this.id = _id;
        this.name = _name;
        this.age = _age;
        this.email = _email;
        this.password = _password;
    }

    public int getId() {
        return id;
    }

    public void setId(int _id) {
        this.id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int _age) {
        this.age = _age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String _email) {
        this.email = _email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String _password) {
        this.password = _password;
    }

    public void displayUser() {
        System.out.println("User Id:  " + id);
        System.out.println("User Name:  " + name);
        System.out.println("User Age:  " + age);
        System.out.println("User Email:  " + email);
        System.out.println("User Password:  " + password);
    }

}
