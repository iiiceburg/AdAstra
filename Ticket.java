import java.util.ArrayList;

public class Ticket
{    
    public static void showTicketInfomation(int packageNo, int stationNo, int amount){
        switch(packageNo){
            case 1:
                try
                {
                    PlanetTourInformation.showOnePackagesTourInformation(0, amount);
                    PlanetTourInformation.showOnePackageStationDestinationInformation(0, stationNo);
                }
                catch (java.text.ParseException pe)
                {
                    pe.printStackTrace();
                }
                break;
            case 2:
                try
                {
                    PlanetTourInformation.showOnePackagesTourInformation(1, amount);
                    PlanetTourInformation.showOnePackageStationDestinationInformation(1, stationNo);
                }
                catch (java.text.ParseException pe)
                {
                    pe.printStackTrace();
                }
                break;
            case 3:
                try
                {
                    PlanetTourInformation.showOnePackagesTourInformation(2, amount);
                    PlanetTourInformation.showOnePackageStationDestinationInformation(2, stationNo);
                }
                catch (java.text.ParseException pe)
                {
                    pe.printStackTrace();
                }
                break;
            case 4:
                try
                {
                    PlanetTourInformation.showOnePackagesTourInformation(3, amount);
                }
                catch (java.text.ParseException pe)
                {
                    pe.printStackTrace();
                }
                break;
        } 
        Passenger.showPassengerInfomation();
    }
}
