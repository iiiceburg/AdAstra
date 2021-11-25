public class Spaceship
{
    //data members
    private String spaceShipName;
    private int capacity;
    
    //methods
    public Spaceship(String spaceShipName, int capacity){
        this.spaceShipName = spaceShipName;
        this.capacity = capacity;
    }
    
    public String getSpaceshipName(){
        return this.spaceShipName;
    }
    
    public int getSpaceshipCapacity(){
        return this.capacity;
    }
}
