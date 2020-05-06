package model;

public class Admin {

    private int id;
    private String username;
    private String email;
    private int status;

    public Admin (int id, String username, String email, int status) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Admin{" +
                " id =" + id +
                ", username = " + username +
                ", email = " + email +
                ", status = " + status +
                " }";
    }
}
