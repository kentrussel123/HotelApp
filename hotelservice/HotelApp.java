// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        // Client interacts with the FrontDesk facade to access hotel services
        frontDesk.requestValetService("ABC123");
        frontDesk.requestHouseKeepingService(101);
        frontDesk.requestCartService(2);
    }
}