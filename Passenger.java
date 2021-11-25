import java.util.ArrayList;

public class Passenger
{
    private String name;
    private String universalPassportId;
    private String congenitalDisease;
    private String emergencyContactInformation;
    private static ArrayList<Passenger> Passenger = new ArrayList<Passenger>();
    
    public Passenger(){
        
    }
    
    public Passenger(String name, String universalPassportId, String congenitalDisease, String emergencyContactInformation){
        this.name = name;
        this.universalPassportId = universalPassportId;
        this.congenitalDisease = congenitalDisease;
        this.emergencyContactInformation = emergencyContactInformation;        
    }
    
    public void addPassenger(){
        
    }
      
    public void getPassengerInfomation(){
        System.out.println("Passnger Name : ".concat(this.name));
        System.out.println("Universal Passport : ".concat(this.universalPassportId));
        System.out.println("Congenital Disease : ".concat(this.congenitalDisease));
        System.out.println("Emergency Contact : ".concat(this.emergencyContactInformation));
    }
    
}
