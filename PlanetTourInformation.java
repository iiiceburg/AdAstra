import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class PlanetTourInformation
{
    private String tourName;
    private ArrayList<Planet> destination;
    protected Date tourStartDate;
    protected Date tourEndDate;
    protected String estimationTime;
    protected float totalOfDistance;
    
    public PlanetTourInformation(){
        this.tourName = tourName;
        this.tourStartDate = tourStartDate;
        this.tourEndDate = tourEndDate;
    }
    
    public Planet[] createPlanet(){
        Planet[] planets = new Planet[4];
        planets[0] = new Planet("Earth",0f);
        planets[1] = new Planet("Mercury",77f);
        planets[2] = new Planet("Venus", 100f);
        planets[3] = new Planet("Mars", 220f);
        return planets;
    }
    
    public void packages(){
         String tourName = this.tourName;
         Planet[] planets = createPlanet();
         for(Planet planet:planets){
             ;
         }
    }
    
    public void getPlanetTourInformation(){

    }
}
