package Builder_design;

public class User {
    private String name;
    private int age;
    private String email;
    private String phone;
    private boolean isAdmin;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
        this.isAdmin = builder.isAdmin;
    }

}