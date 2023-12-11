public class HouseKeeping implements HotelService {
    public void cleanRoom(int roomNumber) {
        // Implementation for room cleaning
        System.out.println("Housekeeping service: Room " + roomNumber + " cleaned.");
    }

    @Override
    public void executeService() {
        // Additional logic for executing housekeeping service if needed
    }
}