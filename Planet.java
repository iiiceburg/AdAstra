import java.util.ArrayList;

public class Planet
{
    //data members
    private String planetName;
    private float distanceFormEarth;
    //methods
    
    protected Planet(String planetName, float distanceFormEarth){
        this.planetName = planetName;
        this.distanceFormEarth = distanceFormEarth;
    }
    
    protected static Planet[] createPlanet(){
        Planet[] planets = new Planet[4];
        planets[0] = new Planet("Earth",0f);
        planets[1] = new Planet("Mercury",77f);
        planets[2] = new Planet("Venus", 100f);
        planets[3] = new Planet("Mars", 220f);
        return planets;
    }
        
    protected String getPlanetName(){
        return this.planetName;
    }
    
    protected float getDistanceFormEarth(){
        return this.distanceFormEarth;
    }
    
    protected String getPlanetStationName(){
        String[] spacePort = createSpacePort();
        return spacePort[0];
    }
    
    protected String getPlanetOrbitStationName(){
        String[] spacePort = createSpacePort();
        return spacePort[1];
    } 
      
    private String[] createSpacePort(){
        String stationName = this.planetName.concat(" Space Port");
        String orbitPortName = this.planetName.concat(" Orbit Port");
        SpaceStation spaceStation = new SpaceStation(stationName,orbitPortName);
        String[] getStationInformation = spaceStation.getSpacePortInformation();
        return getStationInformation;
    }
}
