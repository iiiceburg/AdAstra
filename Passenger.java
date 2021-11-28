import java.util.ArrayList;
import java.util.Scanner;

public class Passenger
{
    private String name;
    private String universalPassportId;
    private String congenitalDisease;
    private String emergencyContactInformation;
    private static ArrayList<Passenger> PASSENGERARRAY = new ArrayList<Passenger>();
        
    protected Passenger(String name, String universalPassportId, String congenitalDisease, String emergencyContactInformation){
        this.name = name;
        this.universalPassportId = universalPassportId;
        this.congenitalDisease = congenitalDisease;
        this.emergencyContactInformation = emergencyContactInformation;        
    }
    
    protected String getPassengerName(){
        return this.name;
    }
    
    protected String getUniversalPassportId(){
        return this.universalPassportId;
    }
    
    protected String getCongenitalDiseasee(){
        return this.congenitalDisease;
    }
    
    protected String getEmergencyContactInformation(){
        return this.emergencyContactInformation;
    }
    
    protected static void addPassenger(int amount){
        for(int i=0; i < amount; i++){
            System.out.println("");
            System.out.println("Enter Passenger Infomation No. ".concat(String.valueOf(i+1)));
            Scanner passengerNameInput = new Scanner(System.in);
            System.out.print("Enter name : ");
            String name = passengerNameInput.nextLine();
            
            Scanner universalPassportInput = new Scanner(System.in);
            System.out.print("Enter Universal Passport : ");
            String universalPassportID = universalPassportInput.nextLine();
            
            Scanner congenitalDiseaseInput = new Scanner(System.in);
            System.out.print("Enter Congenital Disease : ");
            String congenitalDisease = congenitalDiseaseInput.nextLine();
            
            System.out.println("Example : Peeranat Ounahan 0999999999");
            Scanner emergencyContactInformationInput = new Scanner(System.in);
            System.out.print("Enter Emergency Contact : ");
            String emergencyContactInformation = emergencyContactInformationInput.nextLine();
            
            Passenger passenger = new Passenger(name, universalPassportID, congenitalDisease, emergencyContactInformation);
            Passenger.PASSENGERARRAY.add(passenger);
        }
    }
      
    public static void showPassengerInfomation(){
        for(int i=0; i < Passenger.PASSENGERARRAY.size(); i++){
            System.out.println("");
            System.out.println("### Passenger Infomation No. ".concat(String.valueOf(i+1)).concat(" ###"));
            System.out.println("Passnger Name : ".concat(Passenger.PASSENGERARRAY.get(i).getPassengerName()));
            System.out.println("Universal Passport : ".concat(Passenger.PASSENGERARRAY.get(i).getUniversalPassportId()));
            System.out.println("Congenital Disease : ".concat(Passenger.PASSENGERARRAY.get(i).getCongenitalDiseasee()));
            System.out.println("Emergency Contact : ".concat(Passenger.PASSENGERARRAY.get(i).getEmergencyContactInformation()));
            System.out.println("");
        }
    }
}
