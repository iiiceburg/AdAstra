import java.util.Scanner;

public class BookginSystem
{
    public static void main(String [] args){
        
        boolean isWorking = true;
        while(isWorking){
            menu();
            Scanner menuSelected = new Scanner(System.in);
            int menuNo = menuSelected.nextInt();
            
            switch(menuNo){
                case 1:
                    Scanner username = new Scanner(System.in);
                    Scanner password = new Scanner(System.in);
                    
                    String userName = username.nextLine();
                    String pwd = password.nextLine();
                    User user = new User(userName,pwd);
                    if(user.login()){
                        System.out.println("Login Successfully");
                    } else{
                        System.out.println("Username or Password is invalid!");
                        System.out.println("Please try again!");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    isWorking = false;
                    System.out.println("Thank you, Bon Voyage");
                    break;
            }
        }       

    }
    
    private static void menu(){
        System.out.println("---- AdAstra Booking System ----");
        System.out.println("-- Please Select Menu --");
        System.out.println("1.Login");
        System.out.println("2.Register");
        System.out.println("3.Exit");     
        
    }
}
