public class Spaceship
{
    //data members
    private String spaceShipName;
    private int capacity;
    
    //methods
    protected Spaceship(String spaceShipName, int capacity){
        this.spaceShipName = spaceShipName;
        this.capacity = capacity;
    }
    
    protected String getSpaceshipName(){
        return this.spaceShipName;
    }
    
    protected int getSpaceshipCapacity(){
        return this.capacity;
    }
}
