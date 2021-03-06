import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;   
import java.util.ArrayList;

public class PlanetTourInformation
{
    private String tourName;
    private String destination;
    private String tourStartDate;
    private String tourEndDate;
    private float tourPrice;
    private float totalOfDistance;
    private String planetStation;
    private String orbitStation;
    private static ArrayList<PlanetTourInformation> TOURINFORMATIONARRAYLIST = new ArrayList<PlanetTourInformation>();
        
    protected PlanetTourInformation(String tourName, String destination, String tourStartDate, String tourEndDate, float totalOfDistance ,float tourPrice, String planetStation, String orbitStation){
        this.tourName = tourName;
        this.destination = destination;
        this.totalOfDistance = totalOfDistance;
        this.tourStartDate = tourStartDate;
        this.tourEndDate = tourEndDate;
        this.tourPrice = tourPrice;
        this.planetStation = planetStation;
        this.orbitStation = orbitStation;
    }
    
    protected String getTourName(){
        return this.tourName;
    }
    
    protected String getDestination(){
        return this.destination;
    }
    
    protected String getTourStartDate(){
        return this.tourStartDate;
    }
    
    protected String getTourEndDate(){
        return this.tourEndDate;
    }
    
    protected float getTourPrice(){
        return this.tourPrice;
    }
    
    protected float getTotalOfDistance(){
        return this.totalOfDistance;
    }
    
    protected String getPackagePlanetStation(){
        return this.planetStation;
    }
    
    protected String getPackageOrbitStation (){
        return this.orbitStation;
    }
    
    protected static void createTourInformation(){
        Planet[] planets = Planet.createPlanet();
        Planet earth = planets[0];
        Planet mercury = planets[1];
        Planet venus = planets[2];
        Planet mars = planets[3];
        
        String atlasPackageDestination = earth.getPlanetName() + " -> " + mercury.getPlanetName() + " -> " + venus.getPlanetName();
        String horizonPackageDestination = earth.getPlanetName() + " -> " + venus.getPlanetName() + " -> " + mars.getPlanetName();
        String chroniclePackageDestination = earth.getPlanetName() + " -> " + mercury.getPlanetName() + " -> " + mars.getPlanetName();
 
        String atlasPackagePlanetDestination = earth.getPlanetStationName() + " -> " + mercury.getPlanetStationName() + " -> " + venus.getPlanetStationName();
        String horizonPackagePlanetDestination = earth.getPlanetStationName() + " -> " + venus.getPlanetStationName() + " -> " + mars.getPlanetStationName();
        String chroniclePackaPlanetgeDestination = earth.getPlanetStationName() + " -> " + mercury.getPlanetStationName() + " -> " + mars.getPlanetStationName();
        
        String atlasPackageOrbitDestination = earth.getPlanetOrbitStationName() + " -> " + mercury.getPlanetOrbitStationName() + " -> " + venus.getPlanetOrbitStationName();
        String horizonPackageOrbitDestination = earth.getPlanetOrbitStationName() + " -> " + venus.getPlanetOrbitStationName() + " -> " + mars.getPlanetOrbitStationName();
        String chroniclePackaOrbitgeDestination = earth.getPlanetOrbitStationName() + " -> " + mercury.getPlanetOrbitStationName() + " -> " + mars.getPlanetOrbitStationName();
        
        float atlastPackageTotalOfDistance = Float.sum(mercury.getDistanceFormEarth(),venus.getDistanceFormEarth());
        float horizonPackageTotalOfDistance = Float.sum(venus.getDistanceFormEarth(),mars.getDistanceFormEarth());
        float chroniclePackageTotalOfDistance = Float.sum(mercury.getDistanceFormEarth(),mars.getDistanceFormEarth());
        
        PlanetTourInformation atlasPackage = new PlanetTourInformation("Atlas",atlasPackageDestination,"01-12-2021 06:00:00","10-01-2022 12:30:50",atlastPackageTotalOfDistance,10f,atlasPackagePlanetDestination,atlasPackageOrbitDestination);
        PlanetTourInformation horizonPackage = new PlanetTourInformation("Horizon",horizonPackageDestination,"01-04-2021 01:10:20","20-08-2021 06:30:50",horizonPackageTotalOfDistance,21.25f,horizonPackagePlanetDestination,horizonPackageOrbitDestination);
        PlanetTourInformation chroniclePackage = new PlanetTourInformation("Chronicle",chroniclePackageDestination,"09-08-2021 09:30:30","09-11-2021 10:33:53",chroniclePackageTotalOfDistance,15.59f,chroniclePackaPlanetgeDestination,chroniclePackaOrbitgeDestination);
        if(PlanetTourInformation.TOURINFORMATIONARRAYLIST.size() < 3){
            PlanetTourInformation.TOURINFORMATIONARRAYLIST.add(atlasPackage);
            PlanetTourInformation.TOURINFORMATIONARRAYLIST.add(horizonPackage);
            PlanetTourInformation.TOURINFORMATIONARRAYLIST.add(chroniclePackage);
        }
    }
            
    public static void showAllPackagesTourInformation() throws ParseException {
        for(int i = 0; i < PlanetTourInformation.TOURINFORMATIONARRAYLIST.size(); i++){
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("Package : ".concat(PlanetTourInformation.TOURINFORMATIONARRAYLIST.get(i).getTourName()));
            System.out.println("Destination : ".concat(PlanetTourInformation.TOURINFORMATIONARRAYLIST.get(i).getDestination()));
            System.out.println("Total of Distance : ".concat(Float.toString(PlanetTourInformation.TOURINFORMATIONARRAYLIST.get(i).getTotalOfDistance())).concat(" ").concat("million km"));
            System.out.println("Start Date : ".concat(PlanetTourInformation.TOURINFORMATIONARRAYLIST.get(i).getTourStartDate()));
            System.out.println("End Date : ".concat(PlanetTourInformation.TOURINFORMATIONARRAYLIST.get(i).getTourEndDate()));
            System.out.println("Estimation time :".concat(differenceDate(PlanetTourInformation.TOURINFORMATIONARRAYLIST.get(i).getTourStartDate(), PlanetTourInformation.TOURINFORMATIONARRAYLIST.get(i).getTourEndDate())));
            System.out.println("Package Price : ".concat(Float.toString(PlanetTourInformation.TOURINFORMATIONARRAYLIST.get(i).getTourPrice())).concat(" BTC Per Person"));
        }
        System.out.println("-----------------------------------------------------------------------------------");
    }
    
    public static void showOnePackagesTourInformation(int packageNo, int amount) throws ParseException {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Package : ".concat(PlanetTourInformation.TOURINFORMATIONARRAYLIST.get(packageNo).getTourName()));
        System.out.println("Destination : ".concat(PlanetTourInformation.TOURINFORMATIONARRAYLIST.get(packageNo).getDestination()));
        System.out.println("Total of Distance : ".concat(Float.toString(PlanetTourInformation.TOURINFORMATIONARRAYLIST.get(packageNo).getTotalOfDistance())).concat(" ").concat("million km"));
        System.out.println("Start Date : ".concat(PlanetTourInformation.TOURINFORMATIONARRAYLIST.get(packageNo).getTourStartDate()));
        System.out.println("End Date : ".concat(PlanetTourInformation.TOURINFORMATIONARRAYLIST.get(packageNo).getTourEndDate()));
        System.out.println("Estimation time :".concat(differenceDate(PlanetTourInformation.TOURINFORMATIONARRAYLIST.get(packageNo).getTourStartDate(), PlanetTourInformation.TOURINFORMATIONARRAYLIST.get(packageNo).getTourEndDate())));
        System.out.println("Total Price : ".concat(Float.toString(PlanetTourInformation.TOURINFORMATIONARRAYLIST.get(packageNo).getTourPrice()*amount)).concat(" BTC"));
        System.out.println("-----------------------------------------------------------------------------------");
    }
    
    public static void showOnePackageStationDestinationInformation(int packageNo, int typeOfStationDestination) {
        if(typeOfStationDestination == 1){
            System.out.println("Package Station Destination : ".concat(PlanetTourInformation.TOURINFORMATIONARRAYLIST.get(packageNo).getPackagePlanetStation()));
        }
        if(typeOfStationDestination == 2){
            System.out.println("Package Station Destination : ".concat(PlanetTourInformation.TOURINFORMATIONARRAYLIST.get(packageNo).getPackageOrbitStation()));
        }
        System.out.println("-----------------------------------------------------------------------------------");
    }
    
    private static String differenceDate(String startDate,String endDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date d1 = sdf.parse(startDate);
        Date d2 = sdf.parse(endDate);
        long difference_In_Time = d2.getTime() - d1.getTime();
        long difference_In_Days = (difference_In_Time/ (1000 * 60 * 60 * 24))% 365;
        long difference_In_Hours= (difference_In_Time/ (1000 * 60 * 60))% 24;
        String estimationTime = difference_In_Days + " " + "Days" + " " + difference_In_Hours + " " + "Hours";
        return estimationTime;
    }
}
