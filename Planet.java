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
        String distance = String.valueOf(this.distanceFormEarth);  
        String[] spacePort = createSpacePort();
        String[] planetInformation = {this.planetName , distance , spacePort[0] , spacePort[1]};
        return planetInformation;
    }
    
    public String getPlanetName(){
        return this.planetName;
    }
    
    public float getdetanceFormEarth(){
        return this.distanceFormEarth;
    }
    
    public String getPlanetStationName(){
        String[] spacePort = createSpacePort();
        return spacePort[0];
    }
    
    public String getPlanetOrbitStationName(){
        String[] spacePort = createSpacePort();
        return spacePort[1];
    }
    
    private String[] createSpacePort(){
        String stationName = this.planetName + " Space Port";
        String orbitPortName = this.planetName + " Orbit Port";
        SpaceStation spaceStation = new SpaceStation(stationName,orbitPortName);
        String[] getStationInformation = spaceStation.getSpacePortInformation();
        return getStationInformation;
    }
}
