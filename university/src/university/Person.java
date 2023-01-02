package university;

public class Person {
        String name;
        Address address;

    public Person(String name, Address address){
        this.name = name;
        this.address = address;
    }


    //getter
    public String getName(){
        return name;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }

    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    //Overriding method for person
    @Override
    public String toString(){
        return "Person{" + "name = '" + name + '\'' + ", address = " + address.toString() + '}';
    }
}
