package mensch.pages.MainNavigation.Model;

/**
 * Created by alexnesov on 10/20/16.
 */
public class Address {
    private String street;
    private String state;
    private String city;
    private String zip;
    private String country;

    Address() {
    }

    public static Address createAddress() {
        return new AddressBuilder().createAddress();
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
