public class Ticket
{
    public Ticket(){
        
    }
    
    public static void getTicketInfomation(int packageNo){
        Passenger.getPassengerInfomation();
        switch(packageNo){
            case 1:
                try
                {
                    PlanetTourInformation.getOnePackagesTourInformation(0);
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
                }
                catch (java.text.ParseException pe)
                {
                    pe.printStackTrace();
                }
                break;
            case 4:
                try
                {
                    PlanetTourInformation.getOnePackagesTourInformation(packageNo-1);
                }
                catch (java.text.ParseException pe)
                {
                    pe.printStackTrace();
                }
                break;
        }    
    }
}
