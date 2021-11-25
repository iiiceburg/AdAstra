public class SpaceStation
{
    //data members
    protected String stationName;
    protected String orbitPortName;
    
    //methods
    public SpaceStation(String stationName, String orbitPortName){
        this.stationName = stationName;
        this.orbitPortName = orbitPortName;
    }
        
    public String[] getSpacePortInformation(){
        String[] spacePort =  {this.stationName,this.orbitPortName};
        return spacePort;
    }
}
