package creational_pattern.factoryMethod._me_02;

public interface BookFactory {
    Book createBook();

    private void deliveryBook(String address, Book book) {
        System.out.println(book + "을 " + address + "로 배송을 완료 하였습니다.");
    }

    private void validate(String name, String address) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("책 이름이 입력되지 않았습니다..");
        }

        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("배송지를 입력해주세요!");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + "배송 준비 중");
    }

    default Book orderShip(String name, String address) {
        validate(name, address);
        prepareFor(name);
        Book book = createBook();
        deliveryBook(address, book);
        return book;
    }


}
