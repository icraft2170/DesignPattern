package creational_pattern.factoryMethod._03_after_v2;


public interface ShipFactory {
    Ship orderShip(String name, String email);
    Ship createShip();
    void validateForEmail(String email);

    void validateForName(String name);
    void prepareFor(String name);
    void sendEmailTo(String email, Ship ship);
}
