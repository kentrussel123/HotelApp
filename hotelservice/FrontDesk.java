public class FrontDesk {
    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    public void requestValetService(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }

    public void requestHouseKeepingService(int roomNumber) {
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestCartService(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
    }

    public void requestAllServices(String plateNumber, int roomNumber, int numberOfCarts) {
        valet.pickUpVehicle(plateNumber);
        houseKeeping.cleanRoom(roomNumber);
        cart.requestCart(numberOfCarts);
    }
}