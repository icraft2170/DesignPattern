package creational_pattern.singleton;

public enum SingletonSix {
    INSTANCE;

    private Integer number;

    // default -> private
    SingletonSix() {}

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
