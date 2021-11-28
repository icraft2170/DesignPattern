package creational_pattern.factoryMethod._03_after_v2;


public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validateForEmail(email);
        validateForName(name);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email,ship);
        return ship;
    };



    Ship createShip();
    void validateForEmail(String email);

    void validateForName(String name);
    void prepareFor(String name);
    void sendEmailTo(String email, Ship ship);
}
