package data;

public class AutorizationCreated extends Autorizations{
    private String token;
    private String error;

    public AutorizationCreated() {
        super();
    }


    public AutorizationCreated(String email, String error) {
        super(email);
        this.error = error;
    }

    public AutorizationCreated(String email, String password, String token) {
        super(email, password);
    }

    public String getEmail() {
        return super.getEmail();
    }

    public void setEmail(String email) {
        super.setEmail(email);
    }

    public String getPassword() {
        return super.getPassword();
    }

    public void setPassword(String password) {
        super.setPassword(password);
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
