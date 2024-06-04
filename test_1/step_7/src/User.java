public class User {
    private String username;
    private String secret;

    public User() {
    }

    public User(String username, String secret) {
        this.username = username;
        this.secret = secret;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

}
