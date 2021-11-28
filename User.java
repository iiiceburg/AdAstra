import java.util.Scanner;
import java.util.ArrayList;

public class User
{
    private String username;
    private String password;
    private static ArrayList<User> ACCOUNT = new ArrayList<User>();
    
    protected User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public static void register(String username, String password){
        User newUser = new User(username,password);
        User.ACCOUNT.add(newUser);
        System.out.println("#Register Successfully");
    }
    
    public static boolean login(String username, String password){
        for(int i=0; i < User.ACCOUNT.size(); i++){
            if(username.equals(User.ACCOUNT.get(i).getUsername()) && password.equals(User.ACCOUNT.get(i).getPassword())){
                return true;
            }
        }          
        return false;
    }
    
    protected String getUsername(){
        return this.username;
    }
    
    protected String getPassword(){
        return this.password;
    }
}
