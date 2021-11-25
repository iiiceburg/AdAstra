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
    private float totalOfDistance;
    private static ArrayList<PlanetTourInformation> TourInformationArray = new ArrayList<PlanetTourInformation>(3);
    
    public PlanetTourInformation(){
        
    }
    
    public PlanetTourInformation(String tourName, String destination, String tourStartDate, String tourEndDate, float totalOfDistance ){
        this.tourName = tourName;
        this.destination = destination;
        this.totalOfDistance = totalOfDistance;
        this.tourStartDate = tourStartDate;
        this.tourEndDate = tourEndDate;
    }
    
    public String getTourName(){
        return this.tourName;
    }
    
    public String getDestination(){
        return this.destination;
    }
    
    public String getTourStartDate(){
        return this.tourStartDate;
    }
    
    public String getTourEndDate(){
        return this.tourEndDate;
    }
    
    public float getTotalOfDistance(){
        return this.totalOfDistance;
    }
    
    protected static void tourInformation(){
        Planet[] planets = Planet.createPlanet();
        Planet earth = planets[0];
        Planet mercury = planets[1];
        Planet venus = planets[2];
        Planet mars = planets[3];
        
        String atlasPackageDestination = earth.getPlanetName() + " -> " + mercury.getPlanetName() + " -> " + venus.getPlanetName();
        String horizonPackageDestination = earth.getPlanetName() + " -> " + venus.getPlanetName() + " -> " + mars.getPlanetName();
        String chroniclePackageDestination = earth.getPlanetName() + " -> " + mercury.getPlanetName() + " -> " + mars.getPlanetName();
        
        float atlastPackageTotalOfDistance = Float.sum(mercury.getDistanceFormEarth(),venus.getDistanceFormEarth());
        float horizonPackageTotalOfDistance = Float.sum(venus.getDistanceFormEarth(),mars.getDistanceFormEarth());
        float chroniclePackageTotalOfDistance = Float.sum(mercury.getDistanceFormEarth(),mars.getDistanceFormEarth());
        
        PlanetTourInformation atlasPackage = new PlanetTourInformation("Atlas",atlasPackageDestination,"10-01-2018 01:10:20","10-06-2020 06:30:50",atlastPackageTotalOfDistance);
        PlanetTourInformation horizonPackage = new PlanetTourInformation("Horizon",horizonPackageDestination,"10-01-2018 01:10:20","10-06-2020 06:30:50",horizonPackageTotalOfDistance);
        PlanetTourInformation chroniclePackage = new PlanetTourInformation("Chronicle",chroniclePackageDestination,"10-01-2018 01:10:20","10-06-2020 06:30:50",chroniclePackageTotalOfDistance);
        if(PlanetTourInformation.TourInformationArray.size() < 3){
            PlanetTourInformation.TourInformationArray.add(atlasPackage);
            PlanetTourInformation.TourInformationArray.add(horizonPackage);
            PlanetTourInformation.TourInformationArray.add(chroniclePackage);
        }
    }
        
    protected static void getAllPackagesTourInformation() throws ParseException {
        for(int i = 0; i < PlanetTourInformation.TourInformationArray.size(); i++){
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("Package : ".concat(PlanetTourInformation.TourInformationArray.get(i).getTourName()));
            System.out.println("Destination : ".concat(PlanetTourInformation.TourInformationArray.get(i).getDestination()));
            System.out.println("Total of Distance : ".concat(Float.toString(PlanetTourInformation.TourInformationArray.get(i).getTotalOfDistance())).concat(" ").concat("million km"));
            System.out.println("Start Date : ".concat(PlanetTourInformation.TourInformationArray.get(i).getTourStartDate()));
            System.out.println("End Date : ".concat(PlanetTourInformation.TourInformationArray.get(i).getTourEndDate()));
            System.out.println("Estimation time :".concat(differenceDate(PlanetTourInformation.TourInformationArray.get(i).getTourStartDate(), PlanetTourInformation.TourInformationArray.get(i).getTourEndDate())));
        }
        System.out.println("-----------------------------------------------------------------------------------");
    }
    
    protected static void getOnePackagesTourInformation(int packageNo) throws ParseException {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Package : ".concat(PlanetTourInformation.TourInformationArray.get(packageNo).getTourName()));
        System.out.println("Destination : ".concat(PlanetTourInformation.TourInformationArray.get(packageNo).getDestination()));
        System.out.println("Total of Distance : ".concat(Float.toString(PlanetTourInformation.TourInformationArray.get(packageNo).getTotalOfDistance())).concat(" ").concat("million km"));
        System.out.println("Start Date : ".concat(PlanetTourInformation.TourInformationArray.get(packageNo).getTourStartDate()));
        System.out.println("End Date : ".concat(PlanetTourInformation.TourInformationArray.get(packageNo).getTourEndDate()));
        System.out.println("Estimation time :".concat(differenceDate(PlanetTourInformation.TourInformationArray.get(packageNo).getTourStartDate(), PlanetTourInformation.TourInformationArray.get(packageNo).getTourEndDate())));
        System.out.println("-----------------------------------------------------------------------------------");
    }
    
    protected static String differenceDate(String start_date,String end_date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date d1 = sdf.parse(start_date);
        Date d2 = sdf.parse(end_date);
        long difference_In_Time = d2.getTime() - d1.getTime();
        long difference_In_Days = (difference_In_Time/ (1000 * 60 * 60 * 24))% 365;
        long difference_In_Hours= (difference_In_Time/ (1000 * 60 * 60))% 24;
        String estimationTime = difference_In_Days + " " + "Days" + " " + difference_In_Hours + " " + "Hours";
        return estimationTime;
    }
}
