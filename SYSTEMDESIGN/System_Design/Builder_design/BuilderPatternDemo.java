package Builder_design;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                        .setName("Mobin")
                        .setAge(25)
                        .setEmail("mobin@email.com")
                        .setAdmin(true)
                        .build();

        System.out.println(user);
    }
}
