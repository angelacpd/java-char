package corp.angela.classes.user;

public class SuperUser {

    // attributes
    private String login;
    private String password;
    String name;

    // constructor same name of the class
    public SuperUser(final String login, final String password) {
        this.login = login;
        this.password = password;
    }

    // methods
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
