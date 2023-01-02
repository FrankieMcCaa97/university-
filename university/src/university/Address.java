package university;

//public class for Address
public class Address {
    private int streetNo;
    private String streetName;
    private String city;
    private String state;
    private String country;

    //constructor with parameters
    public Address(int streetNo, String streetName, String city, String state, String country){
        this.streetNo = streetNo;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    //getter
    public int getStreetNo(){
        return streetNo;
    }

    //setter
    public void setStreetNo(int streetNo){
        this.streetNo = streetNo;
    }

    //get street name
    public String getStreetName(){
        return streetName;
    }
    //set street name
    public void setStreetName(String streetName){
        this.streetName = streetName;
    }
    //get city
    public String getCity(){
        return city;
    }
    //set city
    public void setCity(String city){
        this.city = city;
    }
    //get state
    public String getState(){
        return state;
    }
    //set state
    public void setState(String state){
        this.state = state;
    }
    //get country
    public String getCountry(){
        return country;
    }
    // set country
    public void setCountry(String country){
        this.country = country;
    }

    //Override method for address
    @Override
    public String toString(){
        return "Address{" + "streetNo=" + streetNo + ", streetName='" + streetName + '\'' + ", city='" + city + '\'' + " state='" + state + '\'' + ", country-'" + country + '\'' + '}';
    }
}
