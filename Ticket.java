import java.util.ArrayList;

public class Ticket
{    
    public static void getTicketInfomation(int packageNo, int stationNo){
        Passenger.getPassengerInfomation();
        switch(packageNo){
            case 1:
                try
                {
                    PlanetTourInformation.getOnePackagesTourInformation(0);
                    PlanetTourInformation.getOnePackageStationDestinationInformation(0, stationNo);
                }
                catch (java.text.ParseException pe)
                {
                    pe.printStackTrace();
                }
                break;
            case 2:
                try
                {
                    PlanetTourInformation.getOnePackagesTourInformation(1);
                    PlanetTourInformation.getOnePackageStationDestinationInformation(1, stationNo);
                }
                catch (java.text.ParseException pe)
                {
                    pe.printStackTrace();
                }
                break;
            case 3:
                try
                {
                    PlanetTourInformation.getOnePackagesTourInformation(2);
                    PlanetTourInformation.getOnePackageStationDestinationInformation(2, stationNo);
                }
                catch (java.text.ParseException pe)
                {
                    pe.printStackTrace();
                }
                break;
            case 4:
                try
                {
                    PlanetTourInformation.getOnePackagesTourInformation(3);
                }
                catch (java.text.ParseException pe)
                {
                    pe.printStackTrace();
                }
                break;
        }    
    }
}
