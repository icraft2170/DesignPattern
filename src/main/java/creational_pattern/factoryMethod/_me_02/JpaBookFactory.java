package creational_pattern.factoryMethod._me_02;

public class JpaBookFactory implements BookFactory{
    @Override
    public Book createBook() {
        return new JpaBook();
    }
}
