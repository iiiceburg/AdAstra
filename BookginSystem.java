import java.util.Scanner;

public class BookginSystem
{
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
                    Scanner password = new Scanner(System.in);
                    
                    String userName = username.nextLine();
                    String pwd = password.nextLine();
                    User user = new User(userName,pwd);
                    if(user.login()){
                        System.out.println("Login Successfully");
                        createTour();
                        packageMenu();
                        packageSelection();
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
    
    private static Planet[] createPlanet(){
        Planet planet = new Planet();
        Planet[] getAllPlanets = planet.createPlanet();
        return getAllPlanets;
    }
    
    private static void createTour(){
        Planet[] planets = createPlanet();
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
        System.out.println("Please select package for your trip");
        System.out.println("Press number to select package");
        System.out.println("1.Atlas");
        System.out.println("2.Horizon");
        System.out.println("3.Chronicle");
        System.out.println("4.Back to main menu");
    }
    
    private static void packageSelection(){
        boolean isWorking = true;
        Scanner packageSelected = new Scanner(System.in);
        int packageNo = packageSelected.nextInt();
        while(isWorking){
            switch (packageNo){
                case 1:
                    System.out.println("Atlas");
                    break;
                case 2:
                    System.out.println("Horizon");
                    break;
                case 3:
                    System.out.println("Chronicle");
                    break;
                case 4:
                    isWorking = false;
                    break;
                default:
                    packageMenu();
                    System.out.println("Please select one package in 1 - 4!");
                    packageNo = packageSelected.nextInt();
            }
        }
    }
    
    private static void station(){
        Planet[] planets = createPlanet();
    }
}
