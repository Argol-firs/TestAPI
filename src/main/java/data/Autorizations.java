package data;

public class Autorizations {
    private String email;
    private String password;

    public Autorizations() {
        super();
    }

    public Autorizations(String email) {
        this.email = email;
    }

    public Autorizations(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
