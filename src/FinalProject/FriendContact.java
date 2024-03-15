
package FinalProject;


public class FriendContact extends Contact{
    private String nick_name;
    private String location;
    private String date_of_Birth;

    public FriendContact(){
        
    }
    public FriendContact(String fisrtName, String lastName, String address, String phoneNumber, String email,String nick_name,String location , String date_of_Birth){

        super(fisrtName, lastName,address,phoneNumber, email);
        
        
        this.nick_name = nick_name;
        this.location = location;
        this.date_of_Birth = date_of_Birth;
    }
    
    public void setNick_name(String nick_name) {
        this.nick_name =  nick_name;
    }

    public String getNick_name() {
        return nick_name;
    }
    
    public void setLocation(String location){
        this.location = location;
    }
    public String getlocation(){
        return location;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.date_of_Birth = date_of_Birth;
    }
    public String getDateOfBirth(){
        return date_of_Birth;
    }
    @Override
    public void printInfo(){
        gettype();
        System.out.println(toString());
        System.out.println("Nick_name : " + nick_name);
        System.out.println("Location : " + location);
        System.out.println("Date_Of_Birth : " + date_of_Birth);
        
    }

   void gettype()
   {
       System.out.println("friend type");
   }

    
   
    
     
}


