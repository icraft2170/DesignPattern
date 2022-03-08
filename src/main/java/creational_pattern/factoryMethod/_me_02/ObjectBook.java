package creational_pattern.factoryMethod._me_02;

import java.time.LocalDateTime;

public class ObjectBook extends Book{
    public ObjectBook() {
        setName("오브젝트");
        setIsbn("ISBN0003");
        setPublicationTime(LocalDateTime.now());
    }
}
