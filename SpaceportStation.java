public class SpaceportStation
{
    //data members
    protected String stationName;
    private String launchPadName;
    
    //methods
    public SpaceportStation(String stationName, String launchPadName){
        this.stationName = stationName;
        this.launchPadName = launchPadName;
    }
    
    protected String[] getSpacePortInformation(){
        String[] spacePort =  {this.stationName,this.launchPadName};
        return spacePort;
    }
}
