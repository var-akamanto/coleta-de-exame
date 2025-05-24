package ifsc.poo3.prova.entities;

public class Hospital {
    private String name;
    private String street_name;
    private short street_number;
    private String neighbourhood;
    private String city;
    private String state;
    private String postal_code;
    private int phone_number;
    private String full_address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public short getStreet_number() {
        return street_number;
    }

    public void setStreet_number(short street_number) {
        this.street_number = street_number;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getFull_address() {
        return street_name  + "," +  street_number + ","
                + neighbourhood + "," + city +
                "/" + state +
                "," + postal_code;
    }
}
