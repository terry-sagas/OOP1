package Project;


/*
 * Name: Terry Sagas
 * Date: 24/04/05
 * File: .java
 * Description: Class for the customer 
 */
public class Customer {
    // Storing customers info
    private String name;
    private String address;
    private long phoneNumber;
    private String email;

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email){
        this.email = email;
    }

    // Getters
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmail(){
        return email;
    }
}
