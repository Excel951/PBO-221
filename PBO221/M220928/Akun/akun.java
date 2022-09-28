package PBO221.M220928.Akun;

public class akun {
    private String username, password;

    // set akun untuk admin
    public akun() {
        username = "admin";
        password = "admin";
    }

    // set akun untuk user baru
    // public akun(String username, String password) {
    // this.username = username;
    // this.password = password;
    // }
    public akun(String username, String password) {
        this.username = "user";
        this.password = password;
    }

    // set password baru
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}