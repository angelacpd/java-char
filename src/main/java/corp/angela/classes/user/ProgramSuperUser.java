package corp.angela.classes.user;

public class ProgramSuperUser {

    public static void main(String[] args) {

        final var superUser = new SuperUser("root", "1234");

        superUser.getLogin();

        superUser.getPassword();

        String root = superUser.name;
    }

}
