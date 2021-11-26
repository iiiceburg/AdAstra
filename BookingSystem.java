import java.util.Scanner;
import java.util.ArrayList;

public class BookingSystem
{
    private static ArrayList<String> Packages;
    
    public static void main(String [] args) {
        boolean isWorking = true;
        while(isWorking){
            System.out.println("");
            System.out.println("");
            menu();
            Scanner menuSelected = new Scanner(System.in);
            System.out.print("Enter menu : ");  
            int menuNo = menuSelected.nextInt();
                        
            switch(menuNo){
                case 1:
                    System.out.println("");
                    System.out.println("--- Login ---");
                    Scanner username = new Scanner(System.in);
                    System.out.print("Enter your username : ");  
                    String userName = username.nextLine();
                    Scanner password = new Scanner(System.in);
                    System.out.print("Enter your password : ");  
                    String pwd = password.nextLine();
                    User user = new User(userName,pwd);
                    if(user.login()){
                        System.out.println("#Login Successfully");
                        PlanetTourInformation.tourInformation();
                        try
                        {
                            clear();
                            PlanetTourInformation.showAllPackagesTourInformation();
                        }
                        catch (java.text.ParseException pe)
                        {
                            pe.printStackTrace();
                        }
                        packageMenu();
                        packageSelection();
                        isWorking = false;
                        System.out.println("Thank you, Bon Voyage");
                    } else{
                        System.out.println("Username or Password is invalid!");
                        System.out.println("Please try again!");
                    }
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("--- Register ---");
                    User.register();
                    break;
                case 3:
                    isWorking = false;
                    System.out.println("Thank you, Bon Voyage");
                    break;
            }
        }       

    }
    
    private static void clear() {
        for(int i = 0 ; i<=50 ;i++){
            System.out.println("");
        }
    }
    
    private static void menu(){
        System.out.println("---- AdAstra Booking System ----");
        System.out.println("-- Please Select Menu --");
        System.out.println("1.Login");
        System.out.println("2.Register");
        System.out.println("3.Exit");
    }
            
    private static void packageMenu(){
        System.out.println("# Please select package for your trip #");
        System.out.println("1.Atlas");
        System.out.println("2.Horizon");
        System.out.println("3.Chronicle");
        System.out.println("4.End the program");
    }
    
    private static void packageSelection(){
        boolean isWorking = true;
        while(isWorking){
            Scanner packageSelected = new Scanner(System.in);
            System.out.print("Press number to select package : ");
            int packageNo = packageSelected.nextInt();
            switch(packageNo){
                case 1:
                    System.out.println("");
                    System.out.println("");
                    stationMenu();
                    stationSelection(packageNo);
                    isWorking = false;
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("");
                    stationMenu();
                    stationSelection(packageNo);
                    isWorking = false;
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("");
                    stationMenu();
                    stationSelection(packageNo);
                    isWorking = false;
                    break;
                case 4:
                    clear();
                    isWorking = false;
                    break;
                default:
                    packageMenu();
                    System.out.println("Please select one package in 1 - 4!");
                    break;
            }
        }
    }
    
    private static void stationMenu(){
        System.out.println("# Please select station destination #");
        System.out.println("1.Planet Station");
        System.out.println("2.Orbit Station");
        System.out.println("3.Back to Package page");
    }
    
    private static void stationSelection(int packageNo){
        boolean isWorking = true;
        while(isWorking){
            Scanner stationSelected = new Scanner(System.in);
            System.out.print("Press number to select menu : ");
            int stationNo = stationSelected.nextInt();
            switch(stationNo){
                case 1:
                    OrbitToOrbit falconMKI = new OrbitToOrbit("Falcon MK I",500);
                    
                    Scanner amountOrbitInput = new Scanner(System.in);
                    System.out.print("Enter amount of ticket : ");
                    int amountOrbit = amountOrbitInput.nextInt();
                    
                    if(amountOrbit <= 10){
                        Passenger passengers = new Passenger();
                        passengers.addPassenger(amountOrbit);
                        clear();
                        
                        System.out.println("### Ticket ###");
                        Ticket.showTicketInfomation(packageNo, stationNo);
                        System.out.println("Orbit to Orbit Spaceship : ".concat(falconMKI.getSpaceshipName()));
                        System.out.println("-----------------------------------------------------------------------------------");
                        System.out.println("");
                        System.out.println("This is a really vital message. This message will appear only once.");
                        System.out.println("Please save this information by taking a screen shot or photograph!");
                        System.out.println("");
                        
                        Scanner backToMain = new Scanner(System.in);
                        System.out.print("Enter any key for end program : ");
                        backToMain.next();
                        isWorking = false;
                    }else{
                        System.out.println("Maximum order of ticket is 10");
                    }
                    break;
                case 2:
                    AirlessLander falconMKII = new AirlessLander("Falcon MK II", 1000);
                    
                    Scanner amountAirlessInput = new Scanner(System.in);
                    System.out.print("Enter amount of ticket : ");
                    int amountAirless = amountAirlessInput.nextInt();
                    
                    if(amountAirless <= 10){
                        Passenger passengers = new Passenger();
                        passengers.addPassenger(amountAirless);
                        clear();
                        
                        Ticket.showTicketInfomation(packageNo, stationNo);
                        System.out.println("Airless Lander Spaceship : ".concat(falconMKII.getSpaceshipName()));
                        System.out.println("-----------------------------------------------------------------------------------");
                        
                        System.out.println("");
                        System.out.println("This is a really vital message. This message will appear only once.");
                        System.out.println("Please save this information by taking a screen shot or photograph!");
                        System.out.println("");
                        
                        Scanner backToMain = new Scanner(System.in);
                        System.out.print("Enter any key for end program : ");
                        backToMain.next();
                        isWorking = false;
                    }else{
                        System.out.println("Maximum order of ticket is 10");
                    }
                    break;
                case 3:
                    isWorking = false;
                    PlanetTourInformation.tourInformation();
                    try
                    {
                        clear();
                        PlanetTourInformation.showAllPackagesTourInformation();
                    }
                    catch (java.text.ParseException pe)
                    {
                        pe.printStackTrace();
                    }
                    packageMenu();
                    packageSelection();
                    break;
                default:
                    packageMenu();
                    System.out.println("Please select 1,2 or 3!");
                    break;
            }
        }
    }        
}
