package creational_pattern.singleton;

public class SingletonThree {
    // eager initialization (이른 초기화) 방법
    // 메모리 낭비가 될 수 있다. static 의 scope 는 process 시작 부터 끝까지
    private static final SingletonThree INSTANCE = new SingletonThree();

    private SingletonThree() {
    }

    public static SingletonThree getInstance() {
        return INSTANCE;
    }
}
