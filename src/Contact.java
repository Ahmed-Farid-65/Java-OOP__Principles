public class Contact {
    private String fullName;
    private String address;
    private String phoneNumber;
    private String email; 
    private String messege ;
    private boolean f ;
    {
    fullName="";
    phoneNumber="";
    email="";
    messege="";
    f =true;
    
    
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    public boolean isF() {
        return f;
    }

    public void setF(boolean f) {
        this.f = f;
    }



    public Contact() {
    }
                    //edt_name        //EDT_ADDERSS  
    public Contact(String fullName, String address, String phoneNumber, String email) {
        setFullName(fullName);
        setAddress(address);
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }
    



    public String getfullName() {
        return this.fullName;
    }
                                
     public void setFullName(String fullName) {
        if (!fullName.trim().isEmpty()){
        this.fullName = fullName;
        }
        else{
          
        messege+="full name is invalid\n";
        f = false; 
        }
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
      this.phoneNumber=phoneNumber;
        }
        else{
        messege+="invalid phone number\n";
         f = false;
           
 }
        
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }



    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (!email.matches("[a-zA-Z0-9]+@+[a-zA-Z0-9]+.+[a-zA-Z0-9]")){
          messege+="the email is invalid\n";
        f = false;
        }
        else {
            this.email = email;
        
            
        }

    }

    @Override
    public String toString() {
        return  
            " fullName='" + getfullName() + "'" +
            ", address='" + getAddress() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", email='" + getEmail() + "'" +
            "";
    }

  

}