import java.util.Scanner;
import java.util.ArrayList;

public class BookingSystem
{
    private static ArrayList<String> Passenger;
    
    public static void main(String [] args){
        boolean isWorking = true;
        while(isWorking){
            menu();
            Scanner menuSelected = new Scanner(System.in);
            int menuNo = menuSelected.nextInt();
            //PlanetTourInformation data = new PlanetTourInformation();
            //data.getPlanetTourInformation();
                        
            switch(menuNo){
                case 1:
                    Scanner username = new Scanner(System.in);
                    System.out.print("Enter your username : ");  
                    String userName = username.nextLine();
                    Scanner password = new Scanner(System.in);
                    System.out.print("Enter your password : ");  
                    String pwd = password.nextLine();
                    User user = new User(userName,pwd);
                    if(user.login()){
                        System.out.println("#Login Successfully");
                        clear();
                        tourInformation();
                        packageMenu();
                        packageSelection();
                    } else{
                        System.out.println("Username or Password is invalid!");
                        System.out.println("Please try again!");
                    }
                    break;
                case 2:
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
    
    private static Planet[] planetInformation(){
        Planet planet = new Planet();
        Planet[] getAllPlanets = planet.createPlanet();
        return getAllPlanets;
    }
    
    private static void tourInformation(){
        Planet[] planets = planetInformation();
        Planet earth = planets[0];
        Planet mercury = planets[1];
        Planet venus = planets[2];
        Planet mars = planets[3];
        
        String atlasPackageDestination = earth.getPlanetName() + " -> " + mercury.getPlanetName() + " -> " + venus.getPlanetName();
        String horizonPackageDestination = earth.getPlanetName() + " -> " + venus.getPlanetName() + " -> " + mars.getPlanetName();
        String chroniclePackageDestination = earth.getPlanetName() + " -> " + mercury.getPlanetName() + " -> " + mars.getPlanetName();
        
        float atlastPackageTotalOfDistance = Float.sum(mercury.getdetanceFormEarth(),venus.getdetanceFormEarth());
        float horizonPackageTotalOfDistance = Float.sum(venus.getdetanceFormEarth(),mars.getdetanceFormEarth());
        float chroniclePackageTotalOfDistance = Float.sum(mercury.getdetanceFormEarth(),mars.getdetanceFormEarth());
        
        PlanetTourInformation atlasPackage = new PlanetTourInformation("Atlas",atlasPackageDestination,"10-01-2018 01:10:20","10-06-2020 06:30:50",atlastPackageTotalOfDistance);
        PlanetTourInformation horizonPackage = new PlanetTourInformation("Horizon",horizonPackageDestination,"10-01-2018 01:10:20","10-06-2020 06:30:50",horizonPackageTotalOfDistance);
        PlanetTourInformation chroniclePackage = new PlanetTourInformation("Chronicle",chroniclePackageDestination,"10-01-2018 01:10:20","10-06-2020 06:30:50",chroniclePackageTotalOfDistance);
        
        try
        {
            System.out.println("-----------------------------------------------------------------------------------");
            atlasPackage.getPackagesTourInformation();
            System.out.println("-----------------------------------------------------------------------------------");
            
            horizonPackage.getPackagesTourInformation();
            System.out.println("-----------------------------------------------------------------------------------");
            
            chroniclePackage.getPackagesTourInformation();
            System.out.println("-----------------------------------------------------------------------------------");
        }
        catch (java.text.ParseException pe)
        {
            pe.printStackTrace();
        }
    }
    
    private static void packageMenu(){
        System.out.println("# Please select package for your trip #");
        System.out.println("1.Atlas");
        System.out.println("2.Horizon");
        System.out.println("3.Chronicle");
        System.out.println("4.Back to main menu");
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
                    stationSelection();
                    isWorking = false;
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("");
                    stationMenu();
                    stationSelection();
                    isWorking = false;
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("");
                    stationMenu();
                    stationSelection();
                    isWorking = false;
                    break;
                case 4:
                    isWorking = false;
                    break;
                default:
                    packageMenu();
                    System.out.println("Please select one package in 1 - 4!");
                    break;
            }
        }
    }
    
    private static void planetStationInformation(){
        Planet[] planets = planetInformation();
        Planet earth = planets[0];
        Planet mercury = planets[1];
        Planet venus = planets[2];
        Planet mars = planets[3];
        
        String earthStationName = earth.getPlanetStationName();
        String earthOrbitStationName = earth.getPlanetOrbitStationName();
        
        String mercuryStationName = mercury.getPlanetStationName();
        String mercuryOrbitStationName = mercury.getPlanetOrbitStationName();
        
        String venusStationName = venus.getPlanetStationName();
        String venusOrbitStationName = venus.getPlanetOrbitStationName();
        
        String marsStationName = mars.getPlanetStationName();
        String marsOrbitStationName = mars.getPlanetOrbitStationName();
        
    }
    
    private static void stationMenu(){
        System.out.println("# Please select station destination #");
        System.out.println("1.Planet Station");
        System.out.println("2.Orbit Station");
        System.out.println("3.Back to Package page");
    }
    
    private static void stationSelection(){
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
                        createPassenger(amountOrbit);
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
                        createPassenger(amountAirless);
                    }else{
                        System.out.println("Maximum order of ticket is 10");
                    }
                    break;
                case 3:
                    isWorking = false;
                    break;
                default:
                    packageMenu();
                    System.out.println("Please select 1,2 or 3!");
                    break;
            }
        }
    }
    
    private static void createPassenger(int amount){
        for(int i=0; i < amount; i++){
            Scanner passengerNameInput = new Scanner(System.in);
            System.out.print("Enter name : ");
            String name = passengerNameInput.nextLine();
            
            Scanner universalPassportInput = new Scanner(System.in);
            System.out.print("Enter Universal Passport : ");
            String universalPassportID = universalPassportInput.nextLine();
            
            Scanner congenitalDiseaseInput = new Scanner(System.in);
            System.out.print("Enter Congenital Disease : ");
            String congenitalDisease = congenitalDiseaseInput.nextLine();
            
            System.out.println("Example : Peeranat Ounahan 0999999999");
            Scanner emergencyContactInformationInput = new Scanner(System.in);
            System.out.print("Enter Emergency Contact : ");
            String emergencyContactInformation = emergencyContactInformationInput.nextLine();
            
            Passenger passenger = new Passenger(name, universalPassportID, congenitalDisease, emergencyContactInformation);
            clear();
            passenger.getPassengerInfomation();           
        }        
    }
        
}
