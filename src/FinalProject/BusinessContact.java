
package FinalProject;

public class BusinessContact extends Contact {
    
    private String joptitle;
    private String organization;
    
    
    
        public BusinessContact(String joptitle , String organization,String fisrtName, String lastName, String address, String phoneNumber, String email) 
        {
            super(fisrtName, lastName ,address,phoneNumber,email );
            
            this.joptitle=joptitle;
            this.organization=organization;
                    
        }

    BusinessContact() {
        
    }
        
        
        
        // getters and setters

    public String getJoptitle() {
        return joptitle;
    }

    public void setJoptitle(String joptitle) {
        this.joptitle = joptitle;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
        
    public void printInfo(){
    
    
      //  System.out.println("jop title= '"+ joptitle+"' "+ "organization= '"+ organization+ super.toString());
             gettype();
                System.out.println( toString());
        System.out.println("jop title= '"+ joptitle+"' "+ "organization= '"+ organization);
    }
        
        
    
    void gettype()
            {
                System.out.println("business type");
                
            }
}
