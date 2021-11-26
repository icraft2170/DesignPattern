package creational_pattern.singleton;

public class SingletonTwo {

    private static SingletonTwo instance;

    private SingletonTwo() {
    }

    public static synchronized SingletonTwo getInstance() {
        if(instance == null){
            instance = new SingletonTwo();
        }
        return instance;
    }
    // 임계영역 설정으로 동기화!
}
