package creational_pattern.factoryMethod._03_after_v2;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "icraft2170@gmail.com");
        client.print(new BlackShipFactory(), "BlackShip", "icraft2170@gmail.com");
    }

    // Micro DI
    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name,email));
    }

}
