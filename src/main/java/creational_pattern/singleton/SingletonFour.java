package creational_pattern.singleton;


// double-checked locking 사용한 효율적인 동기화 블럭

public class SingletonFour {
    private static volatile SingletonFour instance;
    // volatile : 휘발성, 변덕스러

    private SingletonFour() {
    }

    public static SingletonFour getInstance() {
        if (instance == null) {
            synchronized (SingletonFour.class){
                if (instance == null) {
                    instance = new SingletonFour();
                }
            }
        }
        return instance;
    }

}
