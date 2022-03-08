package creational_pattern.factoryMethod._me_02;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        BookFactory bookFactory = new ObjectBookFactory();
        Book objectBook = bookFactory.orderShip("오브젝트", "우리 집");
        System.out.println(objectBook);

        BookFactory jpaBookFactory = new JpaBookFactory();
        Book jpaBook = jpaBookFactory.orderShip("JPA", "우리 집");
        System.out.println(jpaBook);

    }
}
