package creational_pattern.factoryMethod._me_02;

public class ObjectBookFactory implements BookFactory {
    @Override
    public Book createBook() {
        return new ObjectBook();
    }
}
