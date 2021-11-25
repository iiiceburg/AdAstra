import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;   

public class PlanetTourInformation
{
    protected String tourName;
    protected String destination;
    protected String tourStartDate;
    protected String tourEndDate;
    protected String estimationTime;
    protected float totalOfDistance;
    
    public PlanetTourInformation(){
        
    }
    
    public PlanetTourInformation(String tourName, String destination, String tourStartDate, String tourEndDate, float totalOfDistance ){
        this.tourName = tourName;
        this.destination = destination;
        this.totalOfDistance = totalOfDistance;
        this.tourStartDate = tourStartDate;
        this.tourEndDate = tourEndDate;
        this.estimationTime = "";
    }
        
    
    public void getPackagesTourInformation() throws ParseException {
        System.out.println("Package : ".concat(this.tourName));
        System.out.println("Destination : ".concat(this.destination));
        System.out.println("Total of Distance : ".concat(Float.toString(this.totalOfDistance)).concat(" ").concat("million km"));
        System.out.println("Start Date : ".concat(this.tourStartDate));
        System.out.println("End Date : ".concat(this.tourEndDate));
        System.out.println("Estimation time :".concat(differenceDate(this.tourStartDate, this.tourEndDate)));
    }
    
    public String differenceDate(String start_date,String end_date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date d1 = sdf.parse(start_date);
        Date d2 = sdf.parse(end_date);
        long difference_In_Time = d2.getTime() - d1.getTime();
        long difference_In_Days = (difference_In_Time/ (1000 * 60 * 60 * 24))% 365;
        long difference_In_Hours= (difference_In_Time/ (1000 * 60 * 60))% 24;
        this.estimationTime = difference_In_Days + " " + "Days" + " " + difference_In_Hours + " " + "Hours";
        return this.estimationTime;
    }
    
}
