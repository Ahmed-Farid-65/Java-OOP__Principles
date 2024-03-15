package FinalProject;
public class Family extends Contact {
    private String nameFamily;


    public Family() {
    }

    public String getNameFamily() {
        return this.nameFamily;
    }

    public void setNameFamily(String nameFamily) {
        this.nameFamily = nameFamily;
    }
    Family(String nameFamily, String fisrtName, String lastName, String address, String phoneNumber, String email){
        super(fisrtName, lastName,address,phoneNumber, email);
        this.nameFamily = nameFamily;
    }
    @Override
    void printInfo() {
        gettype();
        System.out.println(toString());
        System.out.println("family name "+ nameFamily);
    }
    
    void gettype ()
    {
        System.out.println("family type");
    }
}
