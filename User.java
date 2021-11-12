public class User
{
    private String username;
    private String password;
    
    public User(){
        this.username = "none";
        this.password = "none";
    }
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public boolean login(){
        if(this.username.equals("horizon") && this.password.equals("1234")){
            return true;
        }
        
        return false;
    }
}
