package PBO221;

class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class m220914_1 {
    public static void main(String[] args) {
        User user1 = new User("username1", "password");
        System.out.println("username: " + user1.username);
        System.out.println("password: " + user1.password);
    }
}