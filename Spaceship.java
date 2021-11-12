public class Spaceship
{
    //data members
    private String spaceShipName;
    private int capacity;
    private String typeOfShip;
    
    //methods
    public Spaceship(String spaceShipName, int capacity, String typeOfShip){
        this.spaceShipName = spaceShipName;
        this.capacity = capacity;
        this.typeOfShip = typeOfShip;
    }
    
    public String[] getSpaceshipInformation(){
        String shipCapacity = String.valueOf(this.capacity);
        String[] spaceship =  {this.spaceShipName,shipCapacity, this.typeOfShip};
        return spaceship;
    }
}
