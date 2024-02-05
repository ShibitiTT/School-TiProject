
package login;

import java.util.*;

public class Login {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Register userLogin = new Register();
       User user1 = new User();
       String username;
       String password;
       
       System.out.println(" ***REGISTRATION FORM*** ");
       System.out.println(" **Fill in the form** ");
       System.out.println("");
       
       boolean registrationStatus = false;
       do{
        System.out.print("Enter the username : ");
        username = sc.nextLine();
        userLogin.setUsername(username);
        
        System.out.print("Enter the password : ");
        password = sc.nextLine();
        userLogin.setPassword(password);
        
        System.out.print("Enter your First Name : ");
        String firstName = sc.nextLine();
      user1.setfName(firstName);
              
        System.out.print("Enter Your Last Name : ");
        String lastName = sc.nextLine();
        user1.setlName(lastName);
         System.out.println(" ");
         
        if(userLogin.checkUserName(username) && userLogin.checkPasswordComplexity(password)){
            System.out.println(" ");
            System.out.println("Password successfully captured");
            registrationStatus = true;
        }
        else{
            System.out.println("Error!");
        System.out.println("\tUsername is not correctly formatted, \n please ensure that your username contains an underscore \n and is no more than 5 characters long.");
        System.out.println("\nPassword is not correctly formatted, \nplease ensure that the passoword contains atleast 8 characters, \na capital letter, \n a number \n and a special character.");
       System.out.println(" \nTry Again! \n***FILL IN THE FORM***\n ");
       }
       }while(registrationStatus == false);
        
        System.out.println("");
         System.out.println(" -LOG IN NOW-");
            System.out.println(" ");
        
        boolean status = false;
        do{
            System.out.println("***LOG FORM***");
            System.out.print(" Enter Your Username  : ");
            String correct_username = sc.nextLine();
            
            System.out.print(" Enter Your Password : ");
            String correct_password = sc.nextLine();
            if(correct_username.equals(username) && correct_password.equals(password)){
                System.out.print(" \n WELCOME ! " + user1.getfName()+ " " + user1.getlName() + " \nUsername : "+ userLogin.getUsername() + " \nIt is great to see you! ");
                status = true;
            } 
            else{
                System.out.print(" Invalid Username or Password! \n  **Try Again!** \n");
            }
        }while(status == false);
    }
    
    
}
