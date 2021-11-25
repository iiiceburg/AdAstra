import java.util.Scanner;
import java.util.ArrayList;

public class User
{
    private String username;
    private String password;
    private static ArrayList<User> Account = new ArrayList<User>();
    
    public User(){
        this.username = "none";
        this.password = "none";
    }
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public static void register(){
        Scanner username = new Scanner(System.in);
        System.out.print("Enter your username : ");  
        String userName = username.nextLine();
        Scanner password = new Scanner(System.in);
        System.out.print("Enter your password : ");  
        String pwd = password.nextLine();
        User newUser = new User(userName,pwd);
        User.Account.add(newUser);
        System.out.println("#Register Successfully");
    }
    
    public boolean login(){
        for(int i=0; i < User.Account.size(); i++){
            System.out.println(User.Account.get(i).getUsername());
            System.out.println(User.Account.get(i).getPassword());
            if(this.username.equals(User.Account.get(i).getUsername()) && this.password.equals(User.Account.get(i).getPassword())){
                return true;
            }
        }          
        return false;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
}
