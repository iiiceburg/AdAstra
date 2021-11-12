import java.util.Date;
import java.text.SimpleDateFormat;
public class PlanetTourInformation
{
    private String tourId;
    private String tourName;
    private Date tourStartDate;
    private Date tourEndDate;
    private String estimationTime;
    
    public PlanetTourInformation(){
        this.tourId = tourId;
        this.tourName = tourName;
        this.tourStartDate = tourStartDate;
        this.tourEndDate = tourEndDate;
        this.estimationTime = estimationTime;
    }
    
    public Planet[] createPlanet(){
        Planet[] planets = new Planet[4];
        planets[0] = new Planet("Earth",0f);
        planets[1] = new Planet("Mercury",77f);
        planets[2] = new Planet("Venus", 100f);
        planets[3] = new Planet("Mars", 220f);
        return planets;
    }
    
    public void getPlanetTourInformation(){
        System.out.println("a");
    }
}
