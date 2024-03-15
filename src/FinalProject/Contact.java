package FinalProject;
public abstract class Contact {
    private String fisrtName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email; 



    public Contact() 
    {
    }
    

    public Contact(String fisrtName, String lastName, String address, String phoneNumber, String email)
    {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFisrtName() {
        return this.fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() == 11 && phoneNumber.charAt(0)=='0' &&phoneNumber.charAt(1)=='1'
        && (phoneNumber.charAt(2)=='0' || phoneNumber.charAt(2)=='1' || phoneNumber.charAt(2)=='2' || phoneNumber.charAt(2)=='5')){
        this.phoneNumber = phoneNumber;
        }else{
            this.phoneNumber="invalid ph";}
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }



    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (!email.matches("^[a-zA-Z0-9+_-]+@[a-zA-Z0-9.-]+$")){
           this.email="invalid mail";
        }
        else {
            this.email = email;
            System.out.println( email);
            
        }

    }

    @Override
    public String toString() {
        return "" +
                
            " fisrtName='" + getFisrtName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", address='" + getAddress() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", email='" + getEmail() + "'" +
            "";
    }

    abstract void printInfo();//
    
    abstract void gettype();// return type contact

    

}