package creational_pattern.factoryMethod._me_02;

import java.time.LocalDateTime;

public class JpaBook extends Book{

    public JpaBook() {
        setName("JPA");
        setIsbn("ISBN034");
        setPublicationTime(LocalDateTime.now());
    }
}
