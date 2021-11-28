package creational_pattern.factoryMethod._04_java;
import creational_pattern.factoryMethod._02_after.BlackShip;
import creational_pattern.factoryMethod._02_after.WhiteShip;

public class SimpleFactory {
    public Object createProduct(String name){
        if(name.equals("whiteship")) return new WhiteShip();

        if(name.equals("blackship")) return new BlackShip();

        throw new IllegalArgumentException("이름이 잘못되었습니다.");
    }
}
