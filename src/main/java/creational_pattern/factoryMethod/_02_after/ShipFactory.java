package creational_pattern.factoryMethod._02_after;


public interface ShipFactory {
    default Ship orderShip(String name, String email){
        validateForEmail(email);
        validateForName(name);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email,ship);
        return ship;
    };
    Ship createShip();
    private static void validateForEmail(String email) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private static void validateForName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
    }
    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }
    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
