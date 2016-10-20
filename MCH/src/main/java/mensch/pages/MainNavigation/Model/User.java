package mensch.pages.MainNavigation.Model;

/**
 * Created by alexnesov on 10/20/16.
 */
public class User extends Object {

    private String email;
    private String password;

    private Address address;
    private PersonalInformation personalInformation;

    public User(String email, String password, Address address, PersonalInformation personalInformation) {
        this.email = email;
        this.password = password;
        this.address = address;
        this.personalInformation = personalInformation;
    }









}
