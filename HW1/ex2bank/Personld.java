package semester2.lab1.HW1.ex2bank;
// Assignment: 1
// Author: Michael Kupfer, ID: 209493246
import java.util.Objects;

public class Personld {
    private long id;
    private String FirstName;
    private String LastName;
    private String address;

    /**
     * build the Personld object, get id name and address.
     * @param id long - the id of the client.
     * @param firstName the first name of client.
     * @param lastName last name of client.
     * @param address the address of the client.
     */
    public Personld(long id, String firstName,String lastName, String address){
    this.id=Math.abs(id);
    this.FirstName=firstName;
    this.LastName=lastName;
    this.address=address;
    }

    /**
     * method that retuen the address of client.
     * @return the address of the client.
     */
    public String getAddress() {
        return address;
    }

    /**
     * set the address of the client
     * @param address return the address of the client.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the last name of client.
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * setting the last nae of the client.
     * @param lastName setting the last nae of the client.
     */
    public void setLastName(String lastName) {
        LastName = lastName;
    }

    /**
     * return the first name of the client.
     * @return return the first name of the client.
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * setting the first name of the client.
     * @param firstName setting the first name of the client.
     */
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    /**
     * return the id of the client.
     * @return  return the id of the client.
     */
    public long getId() {
        return id;
    }

    /**
     * set the id of client, if its negative then set the abs of it.
     * @param id
     */
    public void setId(long id) {
        this.id=Math.abs(id);
    }

    /**
     * return a string of the details of the client.
     * @return return a string of the details of the client.
     */
    @Override
    public String toString() {
        return "Personld{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    /**
     * check if 2 client are the same client.
     * @param o the other object user want to check.
     * @return true if they are the same, other return false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personld personld = (Personld) o;
        return (id == personld.id);
    }

}
