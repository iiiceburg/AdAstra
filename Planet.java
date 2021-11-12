import java.util.Arrays;
public class Planet
{
    //data members
    private String planetName;
    private float distanceFormEarth;
    
    //methods
    public Planet(String planetName, float distanceFormEarth){
        this.planetName = planetName;
        this.distanceFormEarth = distanceFormEarth;
    }
    
    public String[] getPlanetInformation(){
        String distance = String.valueOf(this.distanceFormEarth) + " million km";  
        String[] spacePort = createSpacePort();
        String[] planetInformation = {this.planetName, distance, spacePort[0], spacePort[1]};
        return planetInformation;
    }
    
    private String[] createSpacePort(){
        String stationName = this.planetName + " Space Port";
        String launchPadName = this.planetName + " Launch Pad";
        SpaceportStation spaceStation = new SpaceportStation(stationName,launchPadName);
        String[] getStationInformation = spaceStation.getSpacePortInformation();
        return getStationInformation;
    }
}
