package login;

import java.util.regex.*;

class Register extends User{
    private String username;
    private String password;
    
    public String getPassword() { return password; }

    public void setUsername(String username) {this.username = username;}

    public String getUsername() {return username; }  
    public void setPassword(String password) { this.password = password;}
    
    public boolean checkUserName(String userName) {
        boolean underscore = userName.contains("_");
            if (userName.length() <= 5 && underscore == true) {
                System.out.println("Username successfully captured");
            return true;
    }
    return false;
}
public boolean checkPasswordComplexity(String password){
    
        String regex = "^(?=.*[0-9])"  
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        
        return m.matches();
    }


}





























/**boolean loginUser(String user,String password){
        if(user.equals(this.user) && password.equals(this.password)){
            return true;
        }
        else{
            return false;
        }
    } 
String returnLoginStatus(String user,String password){
        if(loginUser(user, password)){
            return "Welcome "+firstName +lastName+" it is greater to see you again.";
        }
        else{
            return "Username or password incorrect, please try again.";
        }
    }

    void registerUser(String firstName,String lastName,String user,String password){

        if(checkUserName(user)){
            this.user = user;
            System.out.println("Username successfully Captured");
        }
        else{
            System.out.println("Username is not correctly formatted, \n please ensure that your username contains an underscore \nand is no more than 5 characters long.");
        }
       if(checkPasswordComplexity(password)){
           this.password = password;
            System.out.println("Password successfully captured");
        }
        else{
            System.out.println("Password is not correctly formatted, \nplease ensure that the passoword contains atleast 8 characters, \na capital letter, a number and a special character.");
        }
       if(checkUserName(user) && checkPasswordComplexity(password)){
            this.firstName = firstName;
            this.lastName = lastName;
            System.out.println(returnLoginStatus(user, password));
        }
    }*/