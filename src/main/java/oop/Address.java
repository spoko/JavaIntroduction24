package oop;

public class Address {
    private String country;
    private String city;
    private String location;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Address(String country, String city, String location) {
        setCountry(country);
        setCity(city);
        setLocation(location);
    }
}
