public class SpaceStation
{
    //data members
    private String stationName;
    private String orbitPortName;
    
    //methods
    protected SpaceStation(String stationName, String orbitPortName){
        this.stationName = stationName;
        this.orbitPortName = orbitPortName;
    }
        
    protected String[] getSpacePortInformation(){
        String[] spacePort =  {this.stationName,this.orbitPortName};
        return spacePort;
    }
}
