package FinalProject;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    

    
   public static void main(String[] args)
            {

   Scanner input =new Scanner (System.in); 

 ArrayList<Contact> co=new ArrayList();


boolean r=true;
while (r)
{

    System.out.println("1) add business contact");
    System.out.println("2) add family contact  ");
    System.out.println("3) add friend contact  ");
    System.out.println("4) view all contact  ");
    System.out.println("5) remove ");
    System.out.println("6) update ");
    System.out.println("7) search contact");
    System.out.println("8) exit");
    
    try{
        
    int choise=input.nextInt();
    switch(choise) 
    {
        case 1:
        //    System.out.println("add business contact");
            createBusinessContact(co);
            
             break;
        case 2:
        //    System.out.println("add family contact");
            createFamilyContact(co);
            break;

        case 3:
         //   System.out.println("add friend contact");
            createFriendContact(co);
            break;
        case 4:
        //    System.out.println("view all");
             viewAll(co);
             break;
             
        case 5:
        //    System.out.println("remove");
            removee(co);
            break;
            
        case 6:
      
            updateContact(co);
            break;
            
        case 7:
            searchContact(co);
           
                break;
        case 8:
                // exit
           r=false;
                //        System.out.println("Exiting the program. Goodbye!");

           break;
           
         default:
                System.out.println("Invalid choice. No fields updated.");
            
    }}
      catch (InputMismatchException e)
    {
        System.out.println("Please enter a number!.\n");
        input.nextLine(); // Clear the buffer
    
    }
}


  }

private static void createBusinessContact(ArrayList<Contact>co) 
            {

Scanner in = new Scanner(System.in);

BusinessContact b =new BusinessContact();

System.out.println("enter first name");
String firstName = in.nextLine();


System.out.println("enter last name");
String lastNamein= in.nextLine();

System.out.println("enter address");
String Address   = in.nextLine();

System.out.println("enter phone");
String phoneNum  = in.nextLine();

System.out.println("enter email");
String Email     = in.nextLine();

System.out.println("enter joptitle");
String Joptitle  = in.nextLine();

System.out.println("enter org");
String Organization=in.nextLine();
    

b.setFisrtName(firstName);
b.setLastName(lastNamein);
b.setEmail(Email);
b.setAddress(Address);
b.setPhoneNumber(phoneNum);
b.setJoptitle(Joptitle);
b.setOrganization(Organization);

co.add(b);
        System.out.println("Business contact added successfully.");


   }


    
private static void createFamilyContact(ArrayList<Contact>co)
            {

            Scanner in = new Scanner(System.in);

            Family f =new Family();

            System.out.println("enter first name");
            String firstName = in.nextLine();

            System.out.println("enter last name");
            String lastNamein= in.nextLine();

            System.out.println("enter address");
            String Address   = in.nextLine();

            System.out.println("enter phone");
            String phoneNum  = in.nextLine();

            System.out.println("enter email");
            String Email     = in.nextLine();

            System.out.println("enter family name");
            String familyName  = in.nextLine();



            f.setFisrtName(firstName);
            f.setLastName(lastNamein);
            f.setEmail(Email);
            f.setAddress(Address);
            f.setPhoneNumber(phoneNum);
            f.setNameFamily(familyName);

            co.add(f);
            System.out.println("Family contact added successfully.");


               }





private static void createFriendContact(ArrayList<Contact>co)
            {

            Scanner in = new Scanner(System.in);

            FriendContact w = new FriendContact();

            System.out.println("enter first name");
            String firstName = in.nextLine();

            System.out.println("enter last name");
            String lastNamein= in.nextLine();

            System.out.println("enter address");
            String Address   = in.nextLine();

            System.out.println("enter phone");
            String phoneNum  = in.nextLine();

            System.out.println("enter email");
            String Email     = in.nextLine();

            System.out.println("enter nick name");
            String nickname  = in.nextLine();
            
             System.out.println("enter data of birth");
            String databirth  = in.nextLine();
            
            System.out.println("enter location");
            String location  = in.nextLine();

            w.setFisrtName(firstName);
            w.setLastName(lastNamein);
            w.setEmail(Email);
            w.setAddress(Address);
            w.setPhoneNumber(phoneNum);
            w.setDateOfBirth(databirth);
            w.setNick_name(nickname);
            w.setLocation(location);
            co.add(w);
        System.out.println("Friend contact added successfully.");


               }
      
      

     
      
private static void viewAll(ArrayList<Contact>co)
            {
          for (int i=0; i<co.size() ; i++)
          {
              System.out.println(i+1 +")");
            //  co.get(i).gettype();
              co.get(i).printInfo();
              

          }

          if(co.isEmpty())
          {System.out.println("no contact is found");   }
          }
          
      



private static void removee(ArrayList<Contact>co)
            {
           System.out.println("enter contact number");

           Scanner in = new Scanner(System.in);
try{
           int i =in.nextInt();
           
                  if (i>= 1 && i <= co.size())
                   { 
                         co.remove(i-1);
                       System.out.println("contact is removed succesfuly");
                   }
                  else System.out.println("invalid choise");   
}      catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            in.nextLine(); // Clear the buffer
        }
            }














private static void updateContact(ArrayList<Contact> co)
{
    System.out.println("Enter contact number to update:");
    Scanner in = new Scanner(System.in);
    
    try{
    
    int i = in.nextInt();

    if (i>= 1 && i <= co.size())
        
    {
        Contact contactToUpdate = co.get(i - 1);

        System.out.println("Select field to update:");
        System.out.println("1. Name");
        System.out.println("2. last name");
        System.out.println("3. pohone nunber");
        System.out.println("4. email ");
        System.out.println("5. address ");
        
        int fieldChoice = in.nextInt();

        in.nextLine(); // Consume the newline character

        switch (fieldChoice) {
            case 1:
                System.out.println("Enter new name:");
                String newName = in.nextLine();
                contactToUpdate.setFisrtName(newName);  
                break;
                 case 2:
                System.out.println("Enter last name ");
                String lastname=in.nextLine();
                contactToUpdate.setLastName(lastname);
                break;
                
            case 3:
                System.out.println("Enter new phone number:");
                String newPhoneNumber = in.nextLine();
                contactToUpdate.setPhoneNumber(newPhoneNumber);
                break;
            case 4:
                System.out.println("Enter new email:");
                String newEmail = in.nextLine();
                contactToUpdate.setEmail(newEmail);
                break;
            case 5:
                System.out.println("Enter new address");
                String newAddress=in.nextLine();
                contactToUpdate.setAddress(newAddress);
                break;
           
            default:
                System.out.println("Invalid choice. No fields updated.");
       }

                System.out.println("Contact updated successfully:");
        
        
   }   
              else 
                {
                    System.out.println("Invalid contact number. No contact updated.");
                }    }
          catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            in.nextLine(); // Clear the buffer
        }
}





private static void searchContact(ArrayList<Contact>co) {
     System.out.print("Enter  name to search: ");
     Scanner in = new Scanner(System.in);
     String searchName = in.nextLine();

    boolean contactFound = false;
    for (Contact contact : co) 
    {
        if (contact.toString().toLowerCase().contains(searchName.toLowerCase())) {
            System.out.println("Contact found:" + contact+"\n");
            System.out.println(contact.toString());
            contactFound = true;
        } else {
            System.out.println("Contact not found\n");
        }
        
    }
}}
