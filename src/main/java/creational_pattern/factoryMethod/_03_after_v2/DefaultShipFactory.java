package creational_pattern.factoryMethod._03_after_v2;

public abstract class DefaultShipFactory implements ShipFactory{




    @Override
    public void validateForEmail(String email){
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    @Override
    public void validateForName(String name){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
    }

    @Override
    public void prepareFor(String name){
        System.out.println(name + " 만들 준비 중");
    }

    @Override
    public void sendEmailTo(String email, Ship ship){
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

}

