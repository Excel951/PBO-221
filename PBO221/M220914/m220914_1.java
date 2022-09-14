package PBO221.M220914;

class User {
    String username;
    String password;

    public User(String u, String p) {
        username = u;
        password = p;
    }
}

public class m220914_1 {
    public static void main(String[] args) {
        User user1 = new User("username1", "password");
        System.out.println("username: " + user1.username);
        System.out.println("password: " + user1.password);
    }
}